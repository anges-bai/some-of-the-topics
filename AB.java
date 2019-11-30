/**
 * @Author: BaiMiao
 * @Date: 2019/11/30 15:48
 * @Description:
 */
public class Test3 {
    public static void main(String[] args) {
        B b=new B();
        //newB的对象，调用B类的构造方法，
        //先默认执行B类中的方法，若B类中没有相应的方法，再调用A类中的方法
        System.out.println(b.getValue());
    }

    static class A {
        protected int value;

        public A(int v) {
            setValue(v);  //这里的setValue()调用的是B类中的方法
        }

        public void setValue(int value) {
            this.value = value;
            //1.value：10  2.value=16
        }

        public int getValue() {
            //1.value=11 此时value值为11 已经return 所以getValue的值确定是11
            //2.value=17
            try {
                value++;
                return value;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                //调用B类中的setValue()方法 1.value=22 2.value=34
                System.out.println(value);
                //1.value=22 第一次输出22
                //2.value=34 第二次输出34
            }
            return value;
            //1.value=11  2.value=17
            //第三次输出17
        }
    }

    static class B extends A {
        public B() {
            super(5);
            setValue(getValue() - 3);
            //getValue值11 调用B类中setValue方法
        }

        public void setValue(int value) {
            super.setValue(2 * value);
            //1.value：10  2.value=16
        }
    }
}
