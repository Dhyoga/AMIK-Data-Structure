//import java.util.*;
class DLLInsertNode{
    static Node start;
    static class Node{
        int data;
        Node next;
        Node prev;
    }
    static void insertEnd(int value){
        if(start==null){
            Node new_node=new Node();
            new_node.data=value;
            new_node.next=new_node.prev=new_node;
            start=new_node;
            return;
        }
        Node last=(start).prev;

        Node new_node=new Node();
        new_node.data=value;

        new_node.next=start;

        (start).prev=new_node;

        new_node.prev=last;

        last.next=new_node;
    }
    static void insertBegin(int value){
        Node last=(start).prev;
        Node new_node=new Node();
        new_node.data=value;

        new_node.next=start;
        new_node.prev=last;

        last.next=(start).prev=new_node;
        start=new_node;
    }
    static void insertAfter(int value1, int value2){
        Node new_node=new Node();
        new_node.data=value1;

        Node temp=start;
        while(temp.data != value2)
        temp=temp.next;
        Node next=temp.next;

        temp.next=new_node;
        new_node.prev=temp;
        new_node.next=next;
        next.prev=new_node;
    }
    static void display(){
        Node temp=start;
        System.out.println("Traversal in forward direction");
        while(temp.next != start){
            System.out.printf("%d ", temp.data);
            temp=temp.next;
        }
        System.out.printf("%d ", temp.data);
        System.out.println();
        System.out.println("Traversal in reverse direction");
        Node last=start.prev;
        temp=last;
        while(temp.prev != last){
            System.out.printf("%d ", temp.data);
            temp=temp.prev;
        }
            System.out.printf("%d ", temp.data);
            System.out.println();
    }
    public static void main(String[] args){
        insertEnd(10);
        insertBegin(2002);
        insertAfter(29, 10);
        System.out.println("Creater circular doubly linked list: ");
        display();
    }
}