import java.util.Scanner;
/**
 * @Author: BaiMiao
 * @Date: 2019/12/29 22:36
 * @Description:
 * 对于给定的正整数 n，计算其十进制形式下所有位置数字之和，并计算其平方的各位数字之和。
 * 输入描述：每行输入数据包括一个正整数n(0<n<40000)
 * 输出描述：对于每个输入数据，计算其各位数字之和，以及其平方值的数字之和，
 *          输出在一行中，之间用一个空格分隔，但行末不要有空格。
 * 示例1: 输入4129739999 输出4 7 3 9 16 22 39 36
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //输入的数字
         int b = a*a; //平方
         System.out.print(add(a)); //a的各位数字之和
         System.out.print(" " + add(b)); //b的各位数字之和（a的平方）
         }
         public static int add(int a){
        int sum=0;
        for(;a != 0;){
            sum = sum + a % 10; //取模计算出各位数字，相加计算各位数字之后
             a = a/10;
        }
             return sum;
    }
}
