class LLInsert{
    static class Node{
        public int data;
        public Node nextNode;
        public Node(int data){
            this.data=data;
        }
    }
    static Node getNode(int data){
        return new Node(data);
    }
    static Node InsertPos(Node headNode, int position, int data){
        Node head=headNode;
        if(position<1)
        System.out.print("Invalid position");
        if(position==1){
            Node newNode=new Node(data);
            newNode.nextNode=headNode;
            head=newNode;
        }else{
            while (position-- != 0){
                if(position==1){
                    Node newNode=getNode(data);
                    newNode.nextNode=headNode.nextNode;
                    headNode.nextNode=newNode;
                    break;
                }
                headNode=headNode.nextNode;
            }
            if(position !=1)
            System.out.print("Position out of range");
        }
        return head;
    }
    static void printList(Node node){
        while(node != null){
            System.out.print(node.data);
            node=node.nextNode;
            if(node != null)
            System.out.print(",");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=getNode(3);
        head.nextNode=getNode(5);
        head.nextNode.nextNode=getNode(8);
        head.nextNode.nextNode.nextNode=getNode(10);

        System.out.print("Linked list before insertion: ");
        printList(head);

        int data=12, pos=3;
        head=InsertPos(head, pos, data);
        System.out.print("Linked list after"+" insertion of 12 postion 3: ");
        printList(head);

        data=1;
        pos=1;
        head=InsertPos(head, pos, data);
        System.out.print("Linked list after" + " insertion of 1 at position 1: ");
        printList(head);

        data=15;
        pos=7;
        head=InsertPos(head, pos, data);
        System.out.print("Linked list after" + " insertion of 15 at position 7: ");
        printList(head);
    }
}