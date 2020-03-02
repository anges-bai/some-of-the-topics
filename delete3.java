/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       //head要找到head.next则head必须不为空，所有先排除head为空的情况
       if (head == null) {
           return null;
       }
        head.next = removeElements(head.next,val);
        return head.val == val?head.next:head;
    }
}
