import java.util.Scanner;
/**
 * 由键盘输入三个整数分别存入变量num1、num2、num3，
 * 对它们进行排序,并且从小到大输出。
 */
public class Work6 {
	public static void main(String[] args) {
		System.out.println("请分别输入三个整数");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int temp = 0;
		input.close();
		//比较前两个数，小的在前面
		if(num2<num1){
			temp = num2;
			num2 = num1;
			num1 =temp;
		}
		//比较后面两个数，小的在前
		if(num3<num2){
			temp = num3;
			num3 = num2;
			num2 =temp;
		}
		//再比较前两个数
		if(num2<num1){
			temp = num2;
			num2 = num1;
			num1 =temp;
		}
		System.out.println("三个数由小到大为："+num1+"、"+num2+"、"+num3);
	}
}
