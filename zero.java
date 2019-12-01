import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/1 15:19
 * @Description:
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？比如: n = 10; n! = 3628800,所以答案为2
 * 输入描述：输入为一行，n(1 ≤ n ≤ 1000)
 * 输出描述：输出一个整数,即题目所求
 * 示例1: 输入10 输出2
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int sum=1,res=0,tmp=0;
            for (int i=1;i<=n;i++){
                sum=sum*i;
            }
           System.out.println(sum);
            for (int j=n;j>=5;j--){
                tmp=j;
                if (tmp%5==0){
                    res++;
                }
                tmp/=5;
            }
            System.out.println(res);
        }
    }
}
