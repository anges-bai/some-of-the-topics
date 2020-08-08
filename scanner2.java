import java.util.Scanner;

public class test {

 

public static void main(String[] args) {

// TODO Auto-generated method stub

    System.out.println("请输入字符：");  

        Scanner scanner = new Scanner(System.in);  

        String str = scanner.next();  

        File f=new File("d:\\ss.txt");

 

//字节流输出

FileOutputStream fos=null;

try {

 fos=new FileOutputStream(f);

 

 //定义一个数组

 byte []bytes=new byte[1024];

 //如何把String转换成byte数组

 fos.write(str.getBytes());

 

} catch (Exception e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

 

finally

{

try {

fos.close();

} catch (IOException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

}

  }

 }
