import java.util.Vector;

public class VectorSize {
    public static void main(String[] args) {
    Vector<Integer> vector=new Vector<>();
    vector.add(0);
    vector.add(1);
    vector.add(9);
    System.out.println("Vektor = "+vector);
    System.err.println("Vektor Size = "+vector.size());        
    }
}