import java.util.Stack;

public class StackIdxOf {
    public static void main(String[] args) {
        Stack<String> Tumpuk=new Stack<String>();

        Tumpuk.add("Welcome");
        Tumpuk.add("to");
        Tumpuk.add("Data");
        Tumpuk.add("Structure");
        Tumpuk.add("IF-A");
        String t1=Tumpuk.elementAt(4);

        System.out.println("Tumpuk: "+Tumpuk);
        System.out.println("The first occurance of "+Tumpuk.elementAt(2)+"\nis at index: "+Tumpuk.indexOf("Data"));
        System.out.println("The first occurance of "+t1+"\nis at index: "+Tumpuk.indexOf("IF-A"));
    }
}
