import java.util.ListIterator;
import java.util.Vector;

public class VectorListIter {
    public static void main(String[] args) {
        Vector<String> vt=new Vector<>();
        vt.add("Yoga");
        vt.add("Dhyoga");
        vt.add("Permana");
        ListIterator listitr=vt.listIterator();
        System.out.println("Urutan maju");
        while (listitr.hasNext()) {
            System.out.println(listitr.next());
        }
        System.out.println();
        System.out.println("Urutan mundur");
        while (listitr.hasPrevious()) {
            System.out.println(listitr.previous());
        }
    }
}
