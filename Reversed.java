import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/1 15:57
 * @Description: 输入一个整数，将这个整数以字符串的形式逆序输出程序不考虑负数的情况，
 * 若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * 输入描述： 输入一个int整数
 * 输出描述： 将这个整数以字符串的形式逆序输出
 * 示例1: 输入1516000 输出0006151
 */

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = "";
        while (num != 0) {
            int t1 = num % 10;
            int t2 = num / 10;
            res = res + String.valueOf(t1);
            num = t2;
        }
        System.out.println(res);
    }
}
