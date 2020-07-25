mport java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[0];
		boolean flag=true;
		System.out.print("Enter intager:");
		while(true){
			int num=scanner.nextInt();
			if(num==0){
				break;
			}
			for(int i=0;i<arr.length;i++){
				if(num==arr[i]){
					flag=false;
					break;
				}
			}
			if(flag){
				arr=Arrays.copyOf(arr,arr.length+1);
				arr[arr.length-1]=num;
			}
		}
		flag=true;
		InsertSort(arr);
		System.out.println("The number of distinct number is "+arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] InsertSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int j;
			int e=arr[i];
			for(j=i;j>0&&arr[j-1]>e;j--){
				arr[j]=arr[j-1];
			}
			arr[j]=e;
		}
		return arr;
	} 
}

