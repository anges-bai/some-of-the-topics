import java.util.Scanner;

		public class test3 {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        
		        char[] arr = input.nextLine().toCharArray();
		        int str = arr.length;
		        int word = 0, num = 0;
		        
		        while (str-->0) {
		            char c=arr[arr.length-str-1];
		            if (c>='a'&c<='z'|c>='A'&c<='Z') {
		                word++;
		            } else if (c>='0'&c<='9') {
		                num++;
		            }
		        }
		        System.out.println("英文字符的个数："+word);
		        System.out.println("数字字符的个数："+num);
		        input.close();
		    }
		

	}
