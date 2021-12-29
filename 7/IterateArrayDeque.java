import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class IterateArrayDeque {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<String>();
        dq.add("For");
        dq.addFirst("Structure");
        dq.addLast("Data");
        dq.add("is so attempting");
        for(Iterator<String> itr=dq.iterator();itr.hasNext();){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        for(Iterator<String> itr=dq.descendingIterator();itr.hasNext();){
            System.out.print(itr.next()+" ");
        }System.out.println();
    }
}
