class CLL{
    static class Node{
        int data;
        Node next;
    }
    static Node push(Node head_ref, int data){
        Node ptr1=new Node();
        Node temp=head_ref;
        ptr1.data=data;
        ptr1.next=head_ref;

        if(head_ref!=null){
            while(temp.next != head_ref)
            temp=temp.next;
            temp.next=ptr1;
        }else ptr1.next=ptr1;
        head_ref=ptr1;
        return head_ref;
    }
    static void printList(Node head){
        Node temp=head;
        if(head != null){
            do{System.out.println(temp.data+" ");
            temp=temp.next;
        }while(temp !=head);
        System.out.println();
        }
    }
    public static void main(String args[]){
        Node head=null;
        head=push(head, 10);
        head=push(head, 100);
        head=push(head, 1000);
        head=push(head, 10000);
        System.out.println("Contents of Circular "+"Linked List:");
        printList(head);
    }
} 