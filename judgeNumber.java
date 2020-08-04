import java.util.Scanner;

public class test{
    public static void main(String[] args){
        System.out.print("请输入一个素数：");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if(!isPrime(n)) {
            System.out.println("你输入的不是素数，请重新输入");
            n=scan.nextInt();
        }
        scan.close();
        System.out.println("素数"+n+"能被9整除吗？"+zhengchu(n));
    }
    //判断素数是否能被9整除
    private static boolean zhengchu(int n) {
        return n%9==0;
    }
    //判断输入的数是否是素数
    private static boolean isPrime(int n){
        boolean flag = true;
        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
/*运行结果
请输入一个素数：11
素数11能被9整除吗？false
*/
