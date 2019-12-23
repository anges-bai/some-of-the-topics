import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/23 16:40
 * @Description: 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。
 * 当然，老师有时候需要更新某位同学的成绩.
 * 输入描述：输入包括多组测试数据。每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,
 * 分别代表学生的数目和操作的数目。学生ID编号从1编到N。第二行包含N个整数，
 * 代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩接下来又M行，每一行有一个字符C
 * （只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，
 * 他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少当C为‘U’的时候，表示这是一条更新操作，
 * 要求把ID为A的学生的成绩更改为B。
 * 输出描述：对于每一次询问操作，在一行里面输出最高成绩.
 */
public class MyClass14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        while (scanner.hasNext()) {
            n = scanner.nextInt(); //学生数量
            m = scanner.nextInt(); //老师可以操作的次数
            int[] stu = new int[n];//学生成绩
            for (int i = 0; i < n; i++) {
                stu[i] = scanner.nextInt();
            }
            //老师询问
            for (int i = 0; i < m; i++) {
                String c = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (c.equals("Q")) {
                    int s = Math.min(a, b);//开始下标
                    int e = Math.max(a, b);//结束下标
                    int max = stu[s - 1];
                    //计算出 [s-1 , e)范围的最大值
                    for (int index = s; index < e; index++) {
                        max = Math.max(max, stu[index]);
                    }
                    System.out.println(max);
                }
                if (c.equals("U")) {
                    stu[a - 1] = b;
                }
            }
        }
    }
}
