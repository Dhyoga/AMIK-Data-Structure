import java.util.Vector;

public class VectorEnsureCap {
    public static void main(String[] args) throws Exception{
        try {
            Vector<Integer> vector=new Vector<>();
            vector.add(0);
            vector.add(1);
            vector.add(2);
            vector.add(3);
            System.out.println("Vector = "+vector);
            vector.ensureCapacity(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
