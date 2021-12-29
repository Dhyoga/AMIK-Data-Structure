import java.util.LinkedList;
import java.util.Queue;

public class QLL {
    public static void main(String[] args) {
        Queue<Integer> ll=new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            ll.add(i);
        }
        System.out.println("Elements of queue: "+ll);
        System.out.println("The top: "+ll.peek());
        System.out.println("Elements of queue after peek: "+ll);
        System.out.println("print the top and removed: "+ll.poll());
        System.out.println("Elements of queue after poll: "+ll);
    }
}
