import java.util.Random;
import java.util.Scanner;

class test{

	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入元素个数");
		int n = input.nextInt();
		
		int[] a = new int[n];
		System.out.println("请依次输入元素（用空格分格）");
		for (int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		
		int t = 0, temp;
		while (true) {
			System.out.print("第"+(t++)+"次打乱后：");
			for (int i=0;i<n;i++) {
				System.out.print(a[i]+",");
		
			}
		
		
			System.out.println();
			
			int A = r.nextInt(n);
			int B = r.nextInt(n);
			
			temp = a[A];
			a[A] = a[B];
			a[B] = temp;
			
			Thread.sleep(1000);
		}
	}

}

