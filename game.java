import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/23 16:36
 * @Description:
 * 小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.
 * 在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
 * 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,
 * 并且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi与c的最大公约数.
 * 那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
 * 输入描述：对于每组数据,第一行是两个整数n(1≤n<100000)表示怪物的数量和a表示小易的初始能力值.
 *         第二行n个整数,b1,b2...bn(1≤bi≤n)表示每个怪物的防御力
 * 输出描述：对于每组数据,输出一行.每行仅包含一个整数,表示小易的最终能力值
 */

public class MyClass12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int ability = 0;
        while (scan.hasNext()) {
            num = scan.nextInt();
            //怪物的数量
            ability = scan.nextInt();
            //小易初始化技能值
            for (int i = 0; i < num; ++i) {
                int monster = scan.nextInt();
                if (monster <= ability) {
                    //怪兽防御小于等于技能，技能加怪兽的防御值
                    ability += monster;
                } else {
                    //怪兽防御大于技能，技能加两者的最大公约数
                    ability += GCD(ability, monster);
                }
            }
            System.out.println(ability);
        }
        scan.close();
    }
    /*辗转相除法，又名欧几里德算法，是一种非常高效的求最大公约数（GCD）的算法，
    它无需分解两个整数的质因 子，辗转相除法的递推公式是GCD(a,b)==GCD(b,a%b)，
    当a%b==0时，b即为所求的最大公约数 */


    public static int GCD(int a, int b) {
        int temp;
        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
