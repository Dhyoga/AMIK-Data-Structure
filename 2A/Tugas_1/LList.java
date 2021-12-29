class LList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
    LList llist=new LList();
    llist.head=new Node(1);
    Node second=new Node(2);
    Node third=new Node(3);

    System.out.println("before:");
    printList(llist.head);
    printList(second);
    printList(third);
    llist.head.next=second;
    second.next=third;
    System.out.println("after linked:");
    printList(llist.head);
    }
}