public static void reverseLinkedList(HeroNode node) {
    // 1. 判断所给的链表的长度是0或是1不用反转
    if(node.next == null || node.next.next == null){
        return;
    }
    //2. 定义一个新的头节点，reverseHead
    HeroNode reverseHead = new HeroNode(0,"","");
    //3. 从头到尾去遍历原来的链表，每遍历一个节点，将其取出，放到reverseHead节点的后面
    HeroNode cur = node.next; // 临时变量用来进行遍历操作
    HeroNode next = null; //用来存储当前节点的下一个节点的位置
    while(cur != null) {
        // 从右往左进行插入，
        next = cur.next; // 
        cur.next = reverseHead.next; // 如果temp此时是节点2，那么reverseHead.next是节点1，我们先让节点2的下一位指向节点1
        reverseHead.next = cur; //让新链表的头结点指向取出来的节点。把temp插到reverseHead后面
        cur = next; // 继续
    }

    //4. 将原来的头部.next指向reverseHead.next
    node.next = reverseHead.next;
}
