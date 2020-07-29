import java.util.Scanner;
//取近似值 （不使用库方法）
//写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
public class Work7 {
	public static void main(String[] args) {
		System.out.println("请输入浮点数：");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();
		input.close();
		double rear = number%1;
		double result = 0;
		if(rear>=0.5)
			result =  number-rear+1;
		else
			result = number-rear;
		System.out.println("近似值为："+result);
	}
}
