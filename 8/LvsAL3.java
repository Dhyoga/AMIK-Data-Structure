import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class LvsAL3 {
    public static void main(String[] args) {
        List<String> aL1=new ArrayList<String>();
        aL1.add("Data");
        aL1.add("Structure");
        aL1.add("IF-A");
        Iterator<String> itr=aL1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }System.out.println();
        ArrayList<String> aL2=new ArrayList<String>();
        aL2.add("Yoga");
        aL2.add("\"Dhyoga\"");
        aL2.add("Permana");
        itr=aL2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }System.out.println();
    }
}