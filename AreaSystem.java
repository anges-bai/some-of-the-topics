import java.util.Scanner;
 
public class Work1 {
	//求矩形面积
	public double rectangleArea(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入矩形的宽：");
		int width = input.nextInt();
		System.out.println("请输入矩形的高：");
		int high = input.nextInt();
		input.close();
		return width*high;
	}
	//求圆的面积
	public double circularArea(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		int radis = input.nextInt();
		input.close();
		return 3.14*radis*radis;
	}
		
	//求三角形的面积
	public double triangleArea(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三角形的底：");
		int sideLength1 = input.nextInt();
		System.out.println("请输入三角形的高：");
		int sideLength2 = input.nextInt();
		input.close();
		return 0.5*sideLength1*sideLength2;
	}
	public static void main(String[] args) {
		Work1 work = new Work1();
		double area = 0;
		String shape = "";
		System.out.println("1、矩形     2、三角形      3、圆");
		System.out.println("请选择图形：");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		switch(in) {
		case 1:
			shape = "矩形";
			area = work.rectangleArea();
			break;
		case 2:
			shape = "三角形";
			area = work.triangleArea();
			break;
		case 3:
			shape = "圆";
			area = work.circularArea();
			break;
        default:
			break;
		}
        input.close();
		System.out.println("该"+shape+"的面积为："+area);
	}
}
