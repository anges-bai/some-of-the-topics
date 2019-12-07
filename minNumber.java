import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/6 21:23
 * @Description: 输入描述：每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，
 * 顺序表示我们拥有数字0、数字1 ……数字9的个数。整数间用一个空格分隔。
 * 10个数字的总个数不超过50，且至少拥有1个非0的数字。
 * 输出描述：在一行中输出能够组成的最小的数。
 * 示例1: 输入2 2 0 0 0 3 0 0 1 0 输出10015558
 */

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = new int[10];
        //0 - 9
        // 输入 0 - 9 这10个数字的出现的个数
        for (int i = 0; i < 10; i++) {
            num[i] = in.nextInt();
        }
        //先输出安装1-9的顺序第一个出现的数字1次
        for (int i = 1; i < 10; i++) {
            if (num[i] != 0) {
                System.out.print(i);
                num[i]--;
                break;
            }
        }
        //第二位：输出0
        while (num[0] != 0) {
            System.out.print(0);
            num[0]--;
        }
        //最后按照1-9的顺序输出
        for (int i = 1; i < 10; i++) {
            while (num[i] != 0) {
                System.out.print(i);
                num[i]--;

            }
        }
    }
}
