import java.util.*;
import java.math.BigInteger;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/6 21:22
 * @Description: 请设计一个算法完成两个超长正整数的加法。
 * 输入参数： String addend：加数 String augend：被加数 返回值：加法结果
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String s1 = input.next();
            String s2 = input.next();
            BigInteger num1 = new BigInteger(s1);
            //采用BigInteger可以直接进行大整数进行计算
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
