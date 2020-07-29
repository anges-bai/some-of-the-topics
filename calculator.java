import java.util.Scanner;
//简易计算器
public class Work2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double result = 0;
		System.out.println("请输入算式（逐个输入）");
		int operand1 = input.nextInt();
		String operator = input.next();
		int operand2 = input.nextInt();
		input.close();
		switch (operator) {
		case "+":
			result = operand1 + operand2;
			break;
		case "-":
			result = operand1 - operand2;
			break;
		case "*":
			result = operand1 * operand2;
			break;
		case "/":
			result = operand1 / operand2;
			break;
		default:
			break;
		}
		System.out.println("result="+result);
	}
}
