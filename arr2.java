import java.util.*;

class Demo2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[0];
		System.out.print("Enter intager:");
		while(true){
			int num=scanner.nextInt();
			if(num==0){
				break;
			}
			arr=Arrays.copyOf(arr,arr.length+1);
			arr[arr.length-1]=num;
		}
		int[] oldArr=new int[0];
		for(int i=0;i<arr.length;i++){
			oldArr=Arrays.copyOf(oldArr,oldArr.length+1);
			oldArr[oldArr.length-1]=arr[i];
		}
		arr=InsertSort(arr);
		System.out.println("arr"+Arrays.toString(arr));
		System.out.println("Arr"+Arrays.toString(oldArr));
		if(isEqual(arr,oldArr)){
			System.out.println("The list already sorted");
		}else{
			System.out.println("The list not sorted");
		}
	}
	public static int[] InsertSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int j;
			int e=arr[i];
			for(j=i;j>0&&arr[j-1]>=e;j--){
				arr[j]=arr[j-1];
			}
			arr[j]=e;
		}
		return arr;
	}
	public static boolean isEqual(int[] arr1,int[] arr2){
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}

}
