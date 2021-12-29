import java.util.HashMap;
import java.util.Map;

public class HMInitCapacity {
    public static void main(String[] args) {
        Map<Integer, String> hm1=new HashMap<>(1);
        HashMap<Integer, String> hm2=new HashMap<>(2);
        hm1.put(0, "zero");
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm2.put(3, "three");
        hm2.put(4, "four");
        hm2.put(5, "five");
        System.out.println("HashMap 1 = "+hm1);
        System.out.println("HashMap 2 = "+hm2);
    }
}
