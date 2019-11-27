import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/11/26 20:22
 * @Description:
 * A, B, C三个人是好朋友, 每个人手里都有一些糖果, 我们不知道他们每个人手上具体有多少个糖果,
 * 但是我们知道 以下的信息： A - B, B - C, A + B, B + C.
 * 这四个数值.每个字母代表每个人所拥有的糖果数. 现在需要通过这四个数值
 * 计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
 * 输入描述： 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。
 * 范围均在-30到30之间(闭区间)。
 * 输出描述：输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。
 * 如果不存在 这样的整数A，B，C，则输出No
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("请输入四个数：");
        Scanner scanner = new Scanner(System.in);
        int y1, y2, y3, y4;
        float a, b, c;
        while (scanner.hasNext()) {
            y1 = scanner.nextInt();
            y2 = scanner.nextInt();
            y3 = scanner.nextInt();
            y4 = scanner.nextInt();
            a = (y3 + y1) / 2f;
            b = (y3 - y1) / 2f;
            c = (y4 - y2) / 2f;
            if (a!=((y3 + y1) / 2f)){
                System.out.print("NO");
                return;
            }
            if (b!=((y3 - y1) / 2f) || b!=(y4+y2)/2){
                System.out.print("NO");
                return;
            }
            if (c!=((y4 - y2) / 2f)){
                System.out.print("NO");
                return;
            }
            System.out.print((int)a+" "+(int)b+" "+(int)c);
        }
    }
}
