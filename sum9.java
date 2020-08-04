public class test {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    //递归求阶乘
    public static long factorial(int n) {
        if(n==0||n==1) {
            return 1L;
        }
        return n*factorial(n-1);
    }
}
/*运行结果
120
*/
