//import java.util.*;
class CheckIsCLL{
    static class Node{
        int data;
        Node next;
    }
    static boolean isCircular(Node head){
        if(head==null)
            return true;
        Node node=head.next;
        while(node != null && node != head)
        node=node.next;
        return(node==head);
    }
    static Node newNode(int data){
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        return temp;
    }
    static Node push(Node head_ref, int new_data){
        Node new_Node = new Node();
        new_Node.data=new_data;
        new_Node.next=(head_ref);
        (head_ref)=new_Node;
        return head_ref;
    }
    static Node push2(Node head_ref, int data){
        Node ptr1=new Node();
        Node temp=head_ref;
        ptr1.data=data;
        ptr1.next=head_ref;

        if(head_ref != null){
            while(temp.next != head_ref)
            temp=temp.next;
            temp.next=ptr1;
        }else
        ptr1.next=ptr1;
        head_ref=ptr1;
        return head_ref;
    }
    public static void main(String args[]) {
        Node head=null;
        head=push(head, 1);
        head=push(head, 2);
        head=push(head, 3);
        head=push(head, 4);
        System.out.print(isCircular(head)? "Yes\n":"No\n");

        Node head2=null;        
        head=push2(head2, 4);
        head=push2(head2, 3);
        head=push2(head2, 2);
        head=push2(head2, 1);
        System.out.print(isCircular(head)? "Yes\n":"No\n");
    }
}