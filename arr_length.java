import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/11/27 16:43
 * @Description:
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 * 输入描述：每个测试输入包n个空格分割的n个整数,n不超过100,其中有一个整数出现次数大于等于n/2。
 * 输出描述：输出出现次数大于等于n/2的数。
 * *************************************
 * str.split(" "):按照空格切分字符串
 * Integer.valueOf(str):将数字字符串转为int
 */
public class MyClassTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            String[] strs=str.split(" ");
            int[] arr=new int[str.length()];
            for (int i=0;i<arr.length;i++){
                arr[i]=Integer.valueOf(strs[i]);
            }
            int num=arr[0];
            int count=0;
            for (int j=1;j<arr.length;j++){
                if (arr[j]==num){
                    count++;
                }
                else {
                    j++;
                    num=arr[j];
                }
            }
            if (count>arr.length/2){
                System.out.println(num);
            }
        }
    }

}
