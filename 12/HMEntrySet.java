import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class HMEntrySet {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        hm.put("Language", "English");
        hm.put("Code", "HashMap");
        hm.put("Learn", "More");
        Set<Map.Entry<String, String>> map=hm.entrySet();
        System.out.println("Set ok Keys and Values using entrySet():"+map);
        System.out.println();
        System.out.println("Using.getorDefault : "+hm.getOrDefault("Code", "JavaArticle"));
        System.out.println("Using.getorDefault : "+hm.getOrDefault("Search", "JavaArticle"));
        System.out.println();
        hm.replace("Learn", "Methods");
        System.out.println("Working of replace:"+map);
        System.out.println();
        hm.put("Cool", "HashMap_Methods");
        System.out.println("Working of putifAbsent(): "+map);
        hm.putIfAbsent("Code", "With_Java");
        System.out.println("Working of putifAbsent(): "+map);

    }
}
