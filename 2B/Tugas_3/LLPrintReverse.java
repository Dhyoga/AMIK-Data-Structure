import java.util.*;
class LLPrintReverse{
    static class Node{
        int data;
        Node next;
    }
    static Node push(Node head_ref, int new_data){
        Node new_node=new Node();
        new_node.data=new_data;
        new_node.next=(head_ref);
        (head_ref)=new_node;
        return head_ref;
    }
    static int getCount(Node head){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
            }
        return count;
        }
        static int getNth(Node head, int n){
        Node curr=head;
        for(int i=0;i<n-1 && curr != null;i++)
        curr=curr.next;
        return curr.data;
    }
    static void printReverse(Node head){
        Stack<Node> stk=new Stack<Node>();
        Node ptr=head;
        while(ptr != null){
            stk.push(ptr);
            ptr=ptr.next;
        }
        while(stk.size()>0){
            System.out.print(stk.peek().data+" ");
            stk.pop();
        }
        System.out.println("\n");
    }
    public static void main(String args[]){
        Node head=null;

        head=push(head, 5);
        head=push(head, 4);
        head=push(head, 3);
        head=push(head, 2);
        head=push(head, 1);
        printReverse(head);
    }
}