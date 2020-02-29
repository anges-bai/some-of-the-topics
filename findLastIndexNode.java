public HeroNode findLastIndexNode(Node node，int index) {
    // 判断链表是否为空，
    if (node == null) {
        return null;
    }
    // 不为空，则先进行遍历，输出链表的总长度
    // 定以一个临时变量temp用来进行遍历操作，
    HeroNode temp = head.next;//从链表头部的下一个开始
    // 定义一个size用来存储链表的长度
    int size = 0;
    while (temp != null) {// temp下一个节点还有值
        size++;
        temp = temp.next;//指向下一个节点继续
    }
    System.out.println(size);
    // 得到链表的总长度size后，我们只需遍历size-index次即可得到第K个元素
    HeroNode cur = head.next;
    // 保证输入的index是有效的
    if(index <= 0 || index > size){
        return null;
    }
    for(int i = 0; i< size-index;i++){
        cur = cur.next;
    }
    return cur;
}
