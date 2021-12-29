import java.util.Vector;

public class VetorInsElmAt {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(0);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
        vector.insertElementAt(9, 0);
        System.out.println(vector);
    }
}
