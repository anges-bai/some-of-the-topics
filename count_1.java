import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/21 18:01
 * @Description: 小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。
 * 于是小红要你帮忙判断一下，某串珠子里是否包含了全部自己想要的珠子？
 * 如果是，那么告诉她有多少多余的珠子；如果不是，那么 告诉她缺了多少珠子。
 * 为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。
 * 例如，YrR8RrY是小红想做的珠串；那么 ppRYYGrrYBR2258可以买，因为包含了全部她想要的珠子，
 * 还多了8颗不需要的珠子；ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗 红色的珠子。
 */

public class MyClass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //商人输入
        String have = sc.nextLine();
        //用户输入
        String need = sc.nextLine();
        //商人手上每个珠子的数量统计
        Map<Character, Integer> h = new HashMap<>();
        for (char c : have.toCharArray()) {
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }
        //用户手上每个珠子的数量统计
        Map<Character, Integer> n = new HashMap<>();
        for (char c : need.toCharArray()) {

            if (n.containsKey(c)) {
                n.put(c, n.get(c) + 1);
            } else {
                n.put(c, 1);
            }
        }
        //计算差值，以用户为参考
        boolean weatherBy = true;
        int lack = 0;
        for (Entry<Character, Integer> en : n.entrySet()) {
            char k = en.getKey();
            int v = en.getValue();
            if (h.containsKey(k) && h.get(k) < v) {
                //商人的珠子包含用户的珠子但是不够
                weatherBy = false;
                lack += v - h.get(k);
            } else if (!h.containsKey(k)) {
                //商人的珠子不包含用户的珠子
                weatherBy = false;
                lack += v;
            }
        }
        if (weatherBy) {
            System.out.println("Yes " + (have.length() - need.length()));
        } else {
            System.out.println("No " + lack);
        }
    }
}

