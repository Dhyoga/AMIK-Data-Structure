import java.util.HashSet;
import java.util.Set;

public class HashSetRetainAll {
    public static void main(String[] args) {
        try {
        HashSet<Integer> hSet=new HashSet<>();
        hSet.add(1);
        hSet.add(2);
        hSet.add(3);
        hSet.add(4);
        hSet.add(5);
        System.out.println("Sebelum retain= "+hSet);
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Koleksi elemen yang diretain = "+set);
        hSet.retainAll(set);
        System.out.println("Setelah retain = "+hSet);
        } catch (NullPointerException e) {
            System.out.println("Exception thrown: "+e);
        }
    }
}
