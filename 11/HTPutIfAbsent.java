import java.util.Hashtable;
import java.util.Map;

public class HTPutIfAbsent {
    public static void main(String[] args) {
        Map<String, Integer> tMap=new Hashtable<>();
        tMap.put("Yoga", 10);
        tMap.put("Fajar", 11);
        tMap.put("David", 00);
        System.out.println(tMap.toString());
        
        String retValue=String.valueOf(tMap.putIfAbsent("Dhyoga", 01));
        System.out.println("Return value = "+retValue);
        System.out.println(tMap);

        retValue=String.valueOf(tMap.putIfAbsent("Dhyoga", 01));
        System.out.println("Return value="+retValue);
        System.out.println(tMap);
    }
}
