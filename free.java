import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        System.out.println("请输入小球落地时的高度和求解的次数：");
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();
        int n=scan.nextInt();
        scan.close();
        distance(h,n);
    }
    //小球从h高度落下，经过n次反弹后经过的距离和反弹的高度
    private static void distance(int h,int n) {
        double length=0;
        for(int i=0;i<n;i++) {
            length+=h;
            h/=2.0;
        }
        System.out.println("经过第"+n+"次反弹后，小球共经过"+length+"米，"+"第"+n+"次反弹的高度为"+h+"米");
    }
}
/*运行结果
请输入小球落地时的高度和求解的次数：
100
10
经过第10次反弹后，小球共经过197.0米，第10次反弹的高度为0米
*/
