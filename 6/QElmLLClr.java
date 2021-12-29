import java.util.LinkedList;
import java.util.Queue;

public class QElmLLClr {
    public static void main(String[] args) throws IllegalStateException{
        Queue<Integer> Q=new LinkedList<Integer>();
        Q.add(29);
        Q.add(10);
        Q.add(20);
        Q.add(21);
        System.out.println("Queue: "+Q);
        System.out.println("Queue's head: "+Q.element());
        Q.clear();
        System.out.println("Queue: "+Q);
        System.out.println("Queue's head: "+Q.peek());
        try {
            System.out.println("Queue's head: "+Q.element());
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }    
}
