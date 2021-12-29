import java.util.Vector;

public class VectorIter {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Yoga");
        vector.add("Permana");
        vector.add(1,"Dhyoga");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i)+" ");
        }
        System.out.println();
        for (String i : vector) {
            System.out.print(i+" ");
        }
    }    
}
