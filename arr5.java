import java.util.*;

class Demo5{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter list1:");
		int[] list1=new int[scanner.nextInt()];
		for(int i=0;i<list1.length;i++){
			list1[i]=scanner.nextInt();
		}
		list1=InsertSort(list1);
		System.out.print("Enter list2:");
		int[] list2=new int[scanner.nextInt()];
		for(int i=0;i<list2.length;i++){
			list2[i]=scanner.nextInt();
		}
		list2=InsertSort(list2);
		System.out.println(equals(list1,list2));
	}
	public static boolean equals(int[] l1,int[] l2){
		if(l1.length==l2.length){
			for(int i=0;i<l1.length;i++){
				if(l1[i]!=l2[i]){
					return false;
				}
			}
			return true;
		}else{
			return false;
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
	
