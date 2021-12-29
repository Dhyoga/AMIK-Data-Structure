public class CLLCountNode {
    static class Node{
        int data;
        Node next;
    }
    static Node push(Node head_ref, int data){
        Node ptr1=new Node();
        Node temp=head_ref;
        ptr1.data=data;
        ptr1.next=head_ref;

        if(head_ref != null){
            while(temp.next != head_ref)
            temp=temp.next;
            temp.next=ptr1;
        }else ptr1.next=ptr1;
        head_ref=ptr1;
        return head_ref;
    }
    static int countNodes(Node head){
        Node temp=head;
        int result=0;
        if(head != null){
            do{
                temp=temp.next;
                result++;
            }while(temp != head);
        }
        return result;
    }
    static void printList(Node head){
        Node temp=head;
        if(head!=null){
            do{
                System.out.printf("%d ", temp.data);
                temp=temp.next;
            }while(temp != head);
            System.out.printf("\n");
        }
    }
    public static void main(String args[]) {
        Node head=null;
        head=push(head, 29);
        head=push(head, 10);
        head=push(head, 21);
        head=push(head, 20);
        printList(head);
        System.out.printf("#node:%d\n", countNodes(head));
    }
}