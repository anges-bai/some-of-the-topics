public class Code {
    public static void add(Byte b) {
        b = b++;
    }
    public static void main(String[] args) {
                Byte a = 127;
                Byte b = 127;
                add(++a);
                System.out.print(a + " ");
                add(b);
                System.out.print(b + "");
                 // -128 127
        }
    }
