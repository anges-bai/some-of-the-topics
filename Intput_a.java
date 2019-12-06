import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/6 21:23
 * @Description: 输入描述：输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
 * 输出描述：输出由给定字符C画出的正方形。但是注意到行间距比列间距大，
 * 所以为了让结果看上去更像正方形，我们输 出的行数实际上是列数的50% （四舍五入取整）。
 * 示例1: 输入10 a 输出aaaaaaaaaa
 * a a
 * a a
 * a a
 * aaaaaaaaaa
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //输出的列数
        String c = sc.next();
        //输出的字符
        for (int i = 1; i <= N; i++) {
            //输出第一行
            System.out.print(c);
        }
        System.out.println();
        //第一行换行
        for (int i = 1; i <= Math.ceil((double) N / 2) - 2; i++) {
            //输出中间行
            System.out.print(c);
            //中间行第一个字符
            for (int j = 2; j <= N - 1; j++) {
                System.out.print(" ");
                //中间行其它字符为空字符串
            }
            System.out.println(c);
            //中间行最后一个字符
        }
        for (int i = 1; i <= N; i++) {
            //输出最后一行
            System.out.print(c);
        }
    }
}


