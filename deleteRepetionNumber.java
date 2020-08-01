class test {
 
	public static void main(String[] args) {
		int [] num1=new int[]{1,3,5,6,7};
		int [] num2=new int[]{3,5,6,8};
		merge(num1, num2);
	}
	private static void merge(int [] num1,int [] num2){
		int[] result=new int[num1.length+num2.length];
		int i=0,j=0,k=0;//定义三个变量。i  j  k分别控制num1 num2  result三个数组的下标
		while(i<num1.length && j< num2.length){//两个数组都不为空的时候
			if(num1[i]<num2[j]){//若num1的元素小，加入result
				result[k]=num1[i];
				i++;//num1的下标后移
				k++;//result的下标后移
			}else if(num1[i]==num2[j]){//若二者相等 这一步就是去重复。
				result[k]=num1[i];//这里两个数组的元素把哪个加入result都行
				k++;//result下标后移
				i++;//这里要注意的是  两个重复了，去重之后，两个数组的下标都要后移
				j++;
			}else {
				result[k]=num2[j];//若num2的元素小，加入result
				k++;
				j++;
			}	
		}
		
		//若不要求去重。while循环应换成如下代码：
//		while(i<num1.length && j< num2.length){
//			if(num1[i]<=num2[j]){
//				result[k++]=num1[i++];
//			}else{
//				result[k++]=num2[j++];
//			}
//		}
 
		//下面是当其中一个数组元素全部添加到result了，另一个还没添加完  继续添加。
		while(i<num1.length){//
			result[k]=num1[i];
			i++;
			k++;
		}
		while(j<num2.length){
			result[k]=num2[j];
			j++;
			k++;
		}
		for (int num : result) {
			System.out.println(num);
		}
	}
}
