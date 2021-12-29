import java.util.Hashtable;

public class HashTableContainsKey {
    public static void main(String[] args) {
        Hashtable<Integer, String> h=new Hashtable<>();
        h.put(1, "Cyan");
        h.put(2, "Magenta");
        h.put(3, "Yellow");
        h.put(4, "Black");
        if (h.containsKey(1)) {
            System.out.println("Key 1 is found");
        }else{
            System.out.println("Key 1 not found");
        }
        if (h.containsKey(7)) {
            System.out.println("Key 7 is found");
        }else{
            System.out.println("Key 7 not found");
        }
    }
}
