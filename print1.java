import java.util.Stack;
import java.util.ArrayList;

/**
 * 使用栈的递归思想
 * */
//首先定义一个list节点类
 class ListNode {
    int val;
    ListNode next = null;
    //定义构造方法
    ListNode(int val) {
        this.val = val;
    }
}

//定义入口主函数以及实现方法
public class printList {
     //入口函数
     public static void main(String[] args) {
         //此处定义多个list节点,并给定初始值
         ListNode l1 = new ListNode(1);
         ListNode l2 = new ListNode(2);
         ListNode l3 = new ListNode(3);

         l1.next = l2;
         l2.next = l3;
         l3.next = null;
         ArrayList<Integer> al = printList.printListFromTailToHead(l1); //使用静态方法类名调用
         al.forEach(item ->{
             System.out.println(String.valueOf(item));
         });
     }

     //实现方法
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {//传入参数
         //创建栈对象
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {//传入的节点不为空
            stack.push(listNode.val); //push方法，将节点压入栈
            listNode = listNode.next;
            //循环内打印的话每循环一次都要打印一次
        }
//        System.out.println("节点压入栈的结果："+stack.toString()); //测试结果：while循环外打印入栈的结果[1,2,3]

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {//栈不为空
            list.add(stack.pop()); //调用pop方法，栈元素循环出栈(先弹出栈顶元素)，结果存入动态数组中
        }
//        System.out.println("list结果："+list.toString());//测试结果
        return list;
    }
}
