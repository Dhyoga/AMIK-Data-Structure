import java.util.Iterator;
import java.util.Stack;

public class StackIterator {
    public static void main(String[] args) {
        Stack<String> Tumpuk=new Stack<String>();
        Tumpuk.add("Welcome");
        Tumpuk.add("to");
        Tumpuk.add("Data");
        Tumpuk.add("Structure");
        Tumpuk.add("IF-A");

        System.out.println("Tumpuk: "+Tumpuk);
        Iterator value=Tumpuk.iterator();
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next()+" ");
        } System.out.println();
        }
}
