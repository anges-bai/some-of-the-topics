/**
 * @Author: BaiMiao
 * @Date: 2019/11/12 16:11
 * @Description:
 * “某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
 * 她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，
 * 喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 */

import java.util.*;

public class Test2 {
    public static int drink(int n) {
        int total = 0;//饮料总数
        // 当大于两个空瓶的时候才可以换饮料
        while (n > 2) {
            //n/3-->能够换来的饮料
            total = total + n / 3; //新的空瓶子个数--》n%3可能会不能整除 n = n/3 + n%3;
        }
        //如果n==2，说明有两个空瓶可以喝商家借一瓶饮料
        if (n == 2) {
            total = total + 1;
        }
        return total;
    }

    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            System.out.println(drink(n));
        }
    }
}

