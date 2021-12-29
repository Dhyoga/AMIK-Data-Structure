import java.util.Vector;

public class VectorGet {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Yoga");
        vector.add("Permana");
        vector.add("Dhyoga");
        System.out.println("Vector = "+vector);
        System.out.println("Vector Indeks 2 = "+vector.get(2));
    }    
}
