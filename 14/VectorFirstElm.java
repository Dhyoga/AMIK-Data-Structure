import java.util.Vector;

public class VectorFirstElm {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(0);
        vector.add(1);
        System.out.println("Vector = "+vector);
        System.out.println("Vector First Element = "+vector.firstElement());
    }    
}
