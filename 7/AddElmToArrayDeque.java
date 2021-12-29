import java.util.ArrayDeque;
import java.util.Deque;
public class AddElmToArrayDeque {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<String>();
        dq.add("The");
        dq.addFirst("To");
        dq.addLast("Data");
        dq.offer("Structure");
        dq.offerFirst("Welcome");
        dq.offerLast("IF-A");
        System.out.println("ArrayDeque = "+dq);
    }
}