import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/4 20:40
 * @Description: 给定一个int数组AB，其第零个元素和第一个元素为待交换的值，请返回交换后的数组。
 * 测试样例： [1,2] 返回：[2,1]
 */

public class Test{
    public static void main(String[] args) {
        int[] AB = new int[3];
        Scanner s1 = new Scanner(System.in);
        while (s1.hasNext()) {
            AB[0] = s1.nextInt();
            AB[1] = s1.nextInt();
            AB[2] = s1.nextInt();
            AB[0] = AB[0] ^ AB[1];
            AB[1] = AB[0] ^ AB[1];
            AB[0] = AB[0] ^ AB[1];
            //int[] AB={1,2,3};

       /* int temp=AB[0];
        AB[0]=AB[1];
        AB[1]=temp;*/
            for (int i = 0; i < AB.length; i++) {
                System.out.println(AB[i]);
            }
        }

    }
}
