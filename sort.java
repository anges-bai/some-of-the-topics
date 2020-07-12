public Node orderList(){
        Node nextNode=null;
        int temp=0;
        Node headNode=head;
        while(headNode.next!=null){
            nextNode=headNode.next;
            while(nextNode!=null){
                if(headNode.data>nextNode.data){
                    temp=nextNode.data;
                    nextNode.data=headNode.data;
                    headNode.data=temp;
                }
                nextNode=nextNode.next;
            }
            headNode=headNode.next;
        }
        return head;
    }
