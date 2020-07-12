/**
 * 方法二：类似于递归思想，利用方法内部不断调用其本身的原理
 * */
import java.util.ArrayList;

public class printList2 {
    public static void main(String[] args){
        //创建节点类对象，并给定初始值
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l3.next=null;

        Solution sol=new Solution();
        ArrayList<Integer> list = sol.printListFromTailToHead(l1);//
        //java1.8版本新特性：lambda表达式
        list.forEach(item->{
            System.out.println(String.valueOf(item));
        });
    }
}

//定义解决方法
class Solution {
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    //定义从尾到头打印结果方法
    public ArrayList<Integer> printListFromTailToHead(ListNode ln) {
        if(ln!=null){
            //递归思想：自己调用自己
            printListFromTailToHead(ln.next);//此处可以自己打印观察一下结果
            arrList.add(ln.val);//添加到数组中
        }
        return arrList;
    }
}

//定义节点类
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
