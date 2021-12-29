import java.util.Vector;

public class VectorClone {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(0);
        vector.add(1);
        vector.add(10);
        vector.add(9);;
        System.out.println("Vector = "+vector);
        Object copy_vector=(Vector)vector.clone();
        System.out.println("Clone Vector = "+copy_vector);
        System.out.println("Apa sama? "+vector.equals(copy_vector));
    }
}
