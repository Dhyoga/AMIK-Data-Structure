import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> STACK=new Stack<String>();
        String t1, t2=" ";

        STACK.push("Data");
        STACK.push("Base");
        STACK.push("IF");
        STACK.push("A");
        STACK.push("10.00");

        System.out.println("Initial Stack: "+STACK);

        t1=STACK.peek();
        System.out.println("peek-1: "+t1);

        t2=STACK.peek();
        System.out.println("peek-2: "+t2);

        System.out.println("Stack after peek: "+STACK);

        STACK.push("Monday");
        System.out.println("Stack after push-1: "+STACK);

        STACK.push("Session");
        System.out.println("Stack after push-2: "+STACK);

        t1=STACK.pop();
        System.out.println("pop-1: "+t1);
        System.out.println("Stack after pop-2: "+STACK);

        t2=STACK.pop();
        System.out.println("pop-2: "+t2);
        System.out.println("Stack after pop-2: "+STACK);

        System.out.println(STACK.capacity());
    }
}
