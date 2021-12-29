import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HMRemIter {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        hm.put("Language", "Java");
        hm.put("Platform", "Desktop");
        hm.put("Code", "HashMap");
        Set<Map.Entry<String, String>> map=hm.entrySet();
        System.out.println("Set of Keys and Values: "+map);
        System.out.println("Use of Iterator to remove sets.");
        Iterator<Map.Entry<String, String>> iterator=hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry=iterator.next();
            iterator.remove();
            System.out.println("Set Keys and Values: "+map);
        }
    }
}
