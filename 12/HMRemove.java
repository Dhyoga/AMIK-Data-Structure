import java.util.HashMap;
import java.util.Map;

public class HMRemove {
    public static void main(String[] args) {
        Map<Integer, String> hm=new HashMap<>();
        hm.put(1, "Structure");
        hm.put(2, "Data");
        hm.put(3, "IF-A");
        hm.put(4, "Structure Data");
        System.out.println("Mapping of HashMap are: "+hm);
        hm.remove(4);
        System.out.println("Mapping after removal are: "+hm);
    }
}
