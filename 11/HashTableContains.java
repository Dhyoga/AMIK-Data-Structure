import java.util.Hashtable;

public class HashTableContains {
    public static void main(String[] args) {
        Hashtable<Integer, String> h=new Hashtable<>();
        String s1="Data", s2="Structure";
        h.put(1, s1);
        h.put(2, s2);
        h.put(3, "IF-A");
        System.out.println(h.contains(s2));
    }
}
