import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveElmArrayDeque {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<String>();
        dq.add("Oktober");
        dq.addFirst("29");
        dq.addLast("2002");
        dq.add("2021");
        System.out.println("ArrayDeque before = "+dq);
        System.out.println("Dengan perintah pop() maka "+dq.pop()+" terhapus");
        System.out.println("Dengan perintah poll() maka "+dq.poll()+" terhapus");
        System.out.println("Dengan perintah pollFirst() maka "+dq.pollFirst()+" terhapus");
        System.out.println("Dengan perintah pollLast() maka "+dq.pollLast()+" terhapus");
        System.out.println("ArrayDeque after = "+dq);
    }
}
