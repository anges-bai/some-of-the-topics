import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @Author: BaiMiao
 * @Date: 2019/12/7 15:50
 * @Description:
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 */
 public class Test6 {
     public static void main(String[] args) throws IOException{
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         String s;
         while((s=bf.readLine())!=null){
             long m = Integer.valueOf(s);
             long a = m*m-m+1;
             //计算首项 S
             System.out.print(a);
             for(int i=1; i<m; i++){
                 //继续等差数列求和
                 System.out.print("+"+(a+=2));
             }
             System.out.println();
         }
         bf.close();
     }
 }

