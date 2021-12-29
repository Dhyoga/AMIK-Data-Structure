import java.util.*;
class QueueExample{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<5;i++)
        q.add(i);
        q.add(8);
        System.out.println("Elements of queue "+q);
        int removedElm=q.remove();
        System.out.println("Removed element is "+removedElm);
        System.out.println(q);
        
        System.out.println("Size of queue is "+q.peek());

        System.out.println(q);
        System.out.println("Size of queue is "+q.element());

        System.out.println(q);
        System.out.println("Size of queue is "+q.pop());

        System.out.println(q);

        System.out.println("Size of queue is "+q.poll());

        System.out.println(q);
        
        int t=3;
        boolean con=q.contains(t);
        System.out.println("Is queue contains "+t+" : "+con);
    }
}