import java.util.Map;
import java.util.TreeMap;

public class TMGetKeyVal {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap=new TreeMap<>();
        tMap.put(0, "Debian");
        tMap.put(1, "Ubuntu");
        tMap.put(2, "Mint");
        for (Map.Entry mEntry : tMap.entrySet()) {
            int key=(int)mEntry.getKey();
            String value=(String)mEntry.getValue();
            System.out.println(key+" : "+value);
        }
    }
}
