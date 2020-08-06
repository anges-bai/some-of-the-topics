import java.util.Scanner;

public class Prog39 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        sum(n);
    }
    //求和函数
    public static void sum(int n) {
        double sum=0;
        if(n%2==0) {
            for(int i=2;i<=n;i+=2) {
                sum+=1.0/i;
            }
            System.out.println("你输入的是偶数，调用函数求得的和是："+sum);
        }else {
            for(int i=1;i<=n;i+=2) {
                sum+=1.0/i;
            }
            System.out.println("你输入的是奇数，调用函数求得的和是："+sum);
        }
    }
}
/*运行结果
请输入一个正整数：
7
你输入的是奇数，调用函数求得的和是：1.676190476190476
*/
