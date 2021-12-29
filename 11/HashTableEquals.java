import java.util.Hashtable;

public class HashTableEquals {
    public static void main(String[] args) {
        Hashtable<Integer, String> h=new Hashtable<>();
        h.put(0, "Data");
        h.put(1, "Structure");
        Hashtable<String, Integer> h1=new Hashtable<>();
        h1.put("Data", 0);
        h1.put("Structure", 1);
        System.out.println("Hashtable 0="+h);
        System.out.println("Hashtable 1="+h1);
        System.out.println("Hastable 0 == Hashtable 1? "+h.equals(h1));
    }
}
