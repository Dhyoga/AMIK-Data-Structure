import java.util.Vector;

public class VectorAddElm {
    public static void main(String[] args) {
        Vector v1=new Vector<>();
        v1.add(0);
        v1.add(1);
        v1.add("Dhyoga");
        System.out.println("Vector = "+v1);

        Vector<Integer> v2=new Vector<>();
        v2.add(1);
        v2.add(0);
        System.out.println("Vector 2 = "+v2);
    }
}
