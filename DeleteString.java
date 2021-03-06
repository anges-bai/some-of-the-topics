import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/11/21 18:03
 * @Description:
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，
 * 小易将不会购买。
 * 输入描述： 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 * 输出描述：输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 */
public class BuyAppleTest {
    public static void main(String[] args) {
        System.out.println("请输入想要购买的苹果数：");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n%2!=0||n<8||n==10||n==12){
            System.out.println(-1);
        }
        else if (n%8==0){
            System.out.println(n/8);
        }else {
            System.out.println(1+n/8);
        }
    }
}
