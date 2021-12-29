import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();

        stack.add("Welcome");
        stack.add("to");
        stack.add("Data");
        stack.add("Structure");
        stack.add("IF-A");

        System.out.println("Stack before: \n"+stack);
        stack.insertElementAt("Hello", 2);
        stack.insertElementAt("World", 6);

        System.out.println("Stack after insert: \n"+stack);
        stack.removeElementAt(2);
        System.out.println("Stack after remove element-2: \n"+stack);
        stack.removeElementAt(5);
        System.out.println("Stack after remove element-5: \n"+stack);
    }
}
