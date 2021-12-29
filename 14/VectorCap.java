import java.util.Vector;

public class VectorCap {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Yoga");
        vector.add("Permana");
        vector.add("Dhyoga");
        System.out.println("Vector = "+vector);
        System.out.println("Kapasitas Vektor = "+vector.capacity());
    }    
}
