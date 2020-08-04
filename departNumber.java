import java.util.*;

public class test {
    public static void main(String[] args) {
    //接收键盘录入一个数，对其进行分解质因数
        System.out.print("请输入一个大于1的正整数");//质数必须大于1
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("你输入的正整数是："+n);
        System.out.print(n+"分解质因数为："+n+"=");
        input.close();
        for(int j=2;j<=n/2;j++){
            if(n%j==0){
                   System.out.print(j+"*");
                   n= n/j;   //用递归把n重新定值
                   j=j-1;    //这步很重要，让for循环重新执行,将判断条件 j=2; 改为 j=j-1是因为
                                //下一个n也需要从先除以2开始循环，执行for循环后j++的值会变为3
            }
        }
        System.out.print(n);    //把最后一个质因数输出，这一步千万别忘！！！
    }
}
/*运行结果
请输入一个大于1的正整数10
你输入的正整数是：10
10分解质因数为：10=2*5
*/
