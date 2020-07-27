import java.util.Scanner;

class Demo6{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of values:");
		int[] arr=new int[scanner.nextInt()];
		System.out.print("Enter values:");
		for(int i=0;i<arr.length;i++){
			arr[i]=scanner.nextInt();
		}
		int maxCount=0;
		for(int i=0;i<arr.length;){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}else{
					break;
				}
			}	
			if(count>maxCount){
				maxCount=count;
			}
			i+=count;
		}
		if(maxCount>=4){
			System.out.println("有");
		}else{
			System.out.println("无");
		}
	}
}
