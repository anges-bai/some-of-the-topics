import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/3 22:02
 * @Description: 给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，
 * 请编写程序统计每种不同 的个位数字出现的次数。
 * 例如：给定N = 100311，则有2个0，3个1，和1个3。
 * 输入描述： 每个输入包含1个测试用例，即一个不超过1000位的正整数N。
 * 输出描述： 对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的 升序输出。
 */

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] chars = N.toCharArray();
        /** * list***有10个item表示0-9，每个item的值表示数字的个数 */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0);
            //初始化每个item都是0
        }
        for (int i = 0; i < chars.length; i++) {
            // 每遇到一个数字，就把值+1
            list.set(chars[i] - '0', list.get(chars[i] - '0') + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                System.out.println(i + ":" + list.get(i));
            }
        }
    }
}
