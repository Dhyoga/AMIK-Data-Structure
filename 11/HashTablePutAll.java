import java.util.Hashtable;

public class HashTablePutAll {
    public static void main(String[] args) {
        Hashtable<String, Integer> h=new Hashtable<>();
        Hashtable<String, Integer> h1=new Hashtable<>();
        h.put("Structure", 3);
        h.put("IF-A", 1);
        h.put("Data", 2);
        h1.putAll(h);
        System.out.println(h1);
    }
}
