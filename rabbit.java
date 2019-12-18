import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/18 22:28
 * @Description:
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，
 * 小兔子长到第三个月后每个月又生一只兔子，假如兔 子都不死，问每个月的兔子总数为多少？
 */

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(rabbit(n));
        }
        sc.close();
    }//递归三要素

    // 1.必须要写一个方法
    //  2.要有出口条件
    // 3.必须有一定的规律
    public static int rabbit(int n) {
        if (n <= 2)
            //月份小于等于2只有一个兔子
            return 1;
        else {
            return rabbit(n - 1) + rabbit(n - 2);
        }
    }
}
