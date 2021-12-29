import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class HMKeySet {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        hm.put("Language", "Java");
        hm.put("Platform", "Data Structure");
        Set<String> HMKeySet=hm.keySet();
        System.out.println("Initial keys : "+HMKeySet);
        Collection<String> hmvalues=hm.values();
        System.out.println("Initial values: "+hmvalues);
        hm.put("Search", "JavaArticle");
        System.out.println("New Keys : "+HMKeySet);
        System.out.println("New Values : "+hmvalues);
    }
}
