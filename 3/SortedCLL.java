class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class SortedCLL {
    Node head;
    SortedCLL(){head=null;}
    void sortedInsert(Node new_Node){
        Node current=head;
        if(current==null){
            new_Node.next=new_Node;
            head=new_Node;
        }else if(current.data >= new_Node.data){
            while(current.next != head)
            current=current.next;
            current.next=new_Node;
            new_Node.next=head;
            head=new_Node;
        }else{
            while(current.next != head && current.next.data < new_Node.data)
           current=current.next; 
            new_Node.next=current.next;
            current.next=new_Node;
        }
    }
    void printList(){
        if(head != null){
            Node temp=head;
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp != head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SortedCLL list=new SortedCLL();
        int arr[]=new int[] {12, 56, 2, 11, 1, 90, 69};
        Node temp=null;
        for(int i=0; i<7;i++){
            temp=new Node(arr[i]);
            list.sortedInsert(temp);
        }
        list.printList();
    }
}
