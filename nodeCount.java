public static int getLength(HeroNode head){
    if(head.next == null){ //空链表
        return 0;
    }
    int length = 0;
    //定义一个辅助变量，直接指向头节点的下一个节点
    HeroNode cur = head.next;
    while(cur != null){
        length++;
        cur = cur.next;//遍历
    }
    return length;
}
