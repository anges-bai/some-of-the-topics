import java.util.Scanner;

public class Prog32{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个大于等于7位的长整形：");
        long l=scan.nextLong();
        scan.close();
        String str=Long.toString(l);//将长整形数字转换成字符串
        char ch[]=str.toCharArray();//将字符串转变成字符数组
        if(ch.length<7) {
            System.out.println("输入的数小于7位");
        }else {
            System.out.println("截取的4~7位数字为："+ch[ch.length-7]+ch[ch.length-6]+ch[ch.length-5]+ch[ch.length-4]);
        }
    }
}
/*运行结果
请输入一个大于等于7位的长整形：
123456789
截取的4~7位数字为：3456
*/
