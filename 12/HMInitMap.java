import java.util.HashMap;
import java.util.Map;

public class HMInitMap {
    public static void main(String[] args) {
        Map<Integer, String> hm1=new HashMap<>();
        hm1.put(0, "A");
        hm1.put(1, "B");
        hm1.put(2, "C");
        HashMap<Integer, String> hm2=new HashMap<>(hm1);
        System.out.println("HashMap 1 = "+hm1);
        System.out.println("HashMap 2 = "+hm2);
    }
}
