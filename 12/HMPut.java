import java.util.HashMap;

public class HMPut {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1=new HashMap<>();
        HashMap<Integer, String> hm2=new HashMap<>();
        hm1.put(0, "Ari");
        hm1.put(1, "Alfajri");
        hm2.put(3, "Wildan");
        hm2.put(4, "Yoga");
        System.out.println("HashMap 1 = "+hm1);
        System.out.println("HashMap 2 = "+hm2);
    }
}
