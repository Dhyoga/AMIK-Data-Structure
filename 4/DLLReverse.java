public class DLLReverse {
    static class Node{
        int data;
        Node prev, next;
    }
    static Node newNode(int val){
    Node temp=new Node();
    temp.data=val;
    temp.prev=temp.next=null;
    return temp;
    }
    static void PrintList(Node head){
        while(head.next != null){
            System.out.print(head.data+" <_> ");
            head=head.next;
        }
        System.out.println(head.data);
    }
    static Node insert(Node head, int val){
        Node temp=newNode(val);
        temp.next=head;
        (head).prev=temp;
        (head)=temp;
        return head;
    }
    static Node reverseList(Node head){
        Node left=head, right=head;
        while(right.next != null)
        right=right.next;
        while(left != right && left.prev != right){
            int t=left.data;
            left.data=right.data;
            right.data=t;
            left=left.next;
            right=right.prev;
        }
        return head;
    }
    public static void main(String args[]){
        Node head=newNode(5);
        head=insert(head, 9);
        head=insert(head, 7);
        head=insert(head, 5);
        head=insert(head, 3);
        head=insert(head, 1);

        PrintList(head);
        System.out.println("List After Reversing");
        head=reverseList(head);
        PrintList(head);
    }
}
        
