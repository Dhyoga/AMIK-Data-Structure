import java.util.Hashtable;

public class HTGet {
    public static void main(String[] args) {
        Hashtable<String, Integer> h=new Hashtable<>();
        h.put("Red", 1);
        h.put("Green", 2);
        h.put("Blue", 3);
        System.out.println("value: "+h.get("Red"));
    }
}
