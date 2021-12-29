import java.util.Vector;

public class VectorElmAt {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(0);
        vector.add(1);
        vector.add(7);
        System.out.println("Vector = "+vector);
        System.out.println("Vector Elemen ke-2 = "+vector.elementAt(1));
    }    
}
