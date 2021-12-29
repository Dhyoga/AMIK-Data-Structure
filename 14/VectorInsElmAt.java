import java.util.Vector;
public class VectorInsElmAt {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(0);
        vector.add(1);
        System.out.println("Vector = "+vector);
        vector.insertElementAt(9, 0);
        System.out.println("Vector after Insert = "+vector);
    }
}
