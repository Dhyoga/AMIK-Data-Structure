import java.util.Vector;

public class VectorSetElmAt {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Yoga");
        vector.add("Permana");
        vector.add("01");
        System.out.println("Vector = "+vector);
        vector.setElementAt("Dhyoga", 2);
        System.out.println("Vector after Update = "+vector);
    }
}
