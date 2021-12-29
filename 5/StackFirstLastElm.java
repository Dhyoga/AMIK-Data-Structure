import java.util.Stack;

/**
 * StackFirstLastElm
 */
public class StackFirstLastElm {
    public static void main(String[] args) {
        Stack<String> Tumpuk=new Stack<String>();
        Tumpuk.add("Welcome");
        Tumpuk.add("to");
        Tumpuk.add("Data");
        Tumpuk.add("Structure");
        Tumpuk.add("IF-A");

        System.out.println("Stack: "+Tumpuk);
        System.out.println("The First Element: "+Tumpuk.firstElement());
        System.out.println("Third Element: "+Tumpuk.get(2));
        System.out.println("The last Element: "+Tumpuk.lastElement());
    }
}