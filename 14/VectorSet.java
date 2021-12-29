import java.util.Vector;

public class VectorSet {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(0);
        vector.add(1);
        vector.add(2);
        vector.add(3);;
        System.out.println("Vector"+vector);
        System.out.println("Vector set Index = 0, Value = 9"+vector.set(0, 9));
        System.out.println("Vector = "+vector);        
    }
}
