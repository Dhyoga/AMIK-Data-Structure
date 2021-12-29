import java.util.LinkedList;
import java.util.Queue;

public class QElmLL {
    public static void main(String[] args) throws IllegalStateException{
        Queue<Integer> Q=new LinkedList<Integer>();
        System.out.println("Queue's head: "+Q.peek());
        try {
            System.out.println("Queue's head: "+Q.element());
        } catch (Exception e) {
            System.out.println(e);
        }
        Q.add(78);
        Q.add(35);
        Q.add(52);
        Q.add(43);
        System.out.println("Queue: "+Q);
        System.out.println("Queue's head"+Q.element());
    }    
}
