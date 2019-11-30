import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2019/11/30 17:39
 * @Description: 找出n个数里最小的k个
 * 输入描述：每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n不超过100。
 * 输出描述：输出n个整数里最小的k个数。
 * 升序输出
 * 示例1: 输入3 9 6 8 -10 7 -11 19 30 12 23 5
 * 输出-11 -10 3 6 7
 */

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length - 1];
            for (int i = 0; i < s.length - 1; i++) {
                num[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(s[s.length - 1]);
            int start = 0;
            int end = num.length - 1;
            int index = qSort(num, start, end);
            while (index != k) {
                if (index > k) {
                    end = index - 1;
                    index = qSort(num, start, end);
                } else {
                    start = index + 1;
                    index = qSort(num, start, end);
                }
            }
            Arrays.sort(num, 0, k);
            for (int i = 0; i < k; i++) {
                System.out.print(i == k - 1 ? num[i] : num[i] + " ");
            }
        }
    }

    public static int qSort(int[] num, int start, int end) {
        int dig = num[start];
        while (start < end) {
            while (start < end && num[end] >= dig) end--;
            num[start] = num[end];
            while (start < end && num[start] < dig) start++;
            num[end] = num[start];
        }
        num[start] = dig;
        return start;

    }
}
