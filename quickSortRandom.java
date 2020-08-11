/**
 * 经典快排、随机快排
 * 经典快排：利用最后一个数作为分界点，小的放左边，大的放右边，可以使用荷兰国旗问题（文末）的方法优化
 * 随机快排：产生一个随机位置作为分界点
 */
 
import java.util.Arrays;
public class C04_QuickSort {
	public static void quickSort(int[]arr){
		if(arr==null || arr.length<2){
			return ;
		}
		//经典快排和随机快排：
		//classicSort(arr,0,arr.length-1);
		randomSort(arr,0,arr.length-1);
	}
	//经典快排
	public static void classicSort(int arr[],int left,int right){
		if(left<right){
			//数组，左边界，右边界，partition的条件num
			int par[] = partition(arr, left, right,arr[right]);
			//递归解决（工程上是不允许递归的）
			classicSort(arr, left, par[0]-1);
			classicSort(arr, par[1]+1, right);
		}
	}
	//随机快排
	public static void randomSort(int arr[],int left,int right){
		if(left<right){
			//随机快排就是经典快排的基础上多这一步：产生一个随机位置与最后一个位置的数交换
			//从而使时间复杂度理论的长期 期望值是 :O(N*logN)
			swap(arr, right, left+(int)((right-left+1)*Math.random()) );
			int par[] = partition(arr, left, right, arr[right]);
			randomSort(arr, left, par[0]-1);
			randomSort(arr, par[1]+1, right);
		}
	}
	//荷兰国旗问题的思想(小于放左边，等于放中间，大于放右边)
	public static int[] partition(int arr[] ,int left,int right,int num){
		int index = left;	//当前位置索引
		int less=left-1;	//小于区域
		int more=right;		//大于区域
		while(index<more){	//当前位置一直往右推移，一定会遇到大于区域
			if(arr[index] < num){
				//当前位置的数与小于区域的下一个数交换，然后当前位置下移一位
				swap(arr,index++,++less);
			}else if(arr[index] > num ){
				//当前位置的数与大于区域的前一个数交换，因为刚交换过来的数不知道大小，所以需要继续比较
				swap(arr, index, --more);
			}else {
				//等于的情况只需要当前位置下移一位
				index++;
			}
		}
		swap(arr, more, right);
		//返回一个等于区域的左右边界
		return new int[]{less+1,more};
	}
 
	//交换
	public static void swap(int arr[],int i,int j){
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t; 
	}
	
	//////////////////////for test/////////////////////
	/*
	 * 使用对数器进行校验
	 */
	
	//产生测试数据
	public static int[] testData(int len,int val){
		int arr[] = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(val*Math.random());
		}
		return arr;
	}
	//打印数组
	public static void printArr(int []arr){
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	//判断两个数组是否相等
	public static boolean isEquals(int[] arr1,int[] arr2){
		if(arr1==null || arr2==null || arr1.length!=arr2.length || arr1.length==0){
			return false;
		}
		boolean judge = true;
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]!=arr2[i]){
				judge = false;
				break;
			}
		}
		return judge;
	}
	public static void main(String[] args) {
		int len = 10;
		int val=100;
		int times = 500000;
		boolean isTrue = true;
		while(times-->0){
			int arr1[] = testData(len, val);
			int arr2[] = Arrays.copyOf(arr1, arr1.length);
			//自己写的快排进行排序
			quickSort(arr1);
			//系统快排
			Arrays.sort(arr2);
			//进行对比
			if(! isEquals(arr1, arr2)){
				printArr(arr1);
				printArr(arr2);
				isTrue = false;
				break;
			}
		}
		if(isTrue){
			System.out.println("Nice!");
		}else {
			System.out.println("Fucking Wrong!");
		}
	}
}
 
