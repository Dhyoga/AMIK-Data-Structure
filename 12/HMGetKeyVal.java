import java.util.HashMap;
import java.util.Map;

public class HMGetKeyVal {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Z", 80);
        map.put("Y", 90);
        map.put("X", 100);
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Key: "+e.getKey()+", Value: "+e.getValue());
        }
    }
}
