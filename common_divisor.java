import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/11/28 19:21
 * @Description:
 * 正整数A和正整数B 的最小公倍数是指能被A和B整除的最小的正整数值，
 * 设计一个算法，求输入A和B的最小 公倍数。
 * 输入描述： 输入两个正整数A和B。
 * 输出描述： 输出A和B的最小公倍数。
 * ——————a*b=最小公倍数*最大公约数——————
 */
public class Test2 {
    public static int gys(int a,int b){
       if (b==0)
           return a;
       return gys(b,a%b);
    }
    public static int gbs(int a,int b){
        return (a*b)/gys(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(gbs(a,b));
    }
}
