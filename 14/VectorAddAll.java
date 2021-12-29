import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class VectorAddAll {
    public static void main(String[] args) {
        Vector<String> vt=new Vector<>();
        vt.add("Yoga");
        vt.add("Dhyoga");
        Collection<String> c=new ArrayList<>();
        c.add("Permana");
        c.add("Yoga Permana");
        System.out.println("Vector = "+vt);
        vt.addAll(c);
        System.out.println("Vector Update = "+vt);
    }    
}
