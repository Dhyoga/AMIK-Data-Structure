import java.util.HashSet;
import java.util.Set;

public class HashSetRemAll {
    public static void main(String[] args) throws Exception{
        try {
            HashSet<Integer> hSet=new HashSet<>();
            hSet.add(1);
            hSet.add(2);
            hSet.add(3);
            hSet.add(4);
            hSet.add(5);
            System.out.println("HashSet sebelum = "+hSet);

            Set<Integer> set=new HashSet<>();
            set.add(1);
            set.add(2);
            set.add(3);
            System.out.println("Elemen yang dihapus = "+set);
            hSet.removeAll(set);
            System.out.println("HashSet setelah = "+hSet);
        } catch (NullPointerException e) {
            System.out.println("Exception thrown: "+e);
        }
    }
}
