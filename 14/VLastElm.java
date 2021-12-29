import java.util.Vector;

public class VLastElm {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(0);
        vector.add(1);
        vector.add(9);
        System.out.println("Vector = "+vector);
        System.out.println("Vector Last Index = "+vector.lastElement());
    }    
}
