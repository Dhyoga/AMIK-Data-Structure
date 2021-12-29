import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TreeMapImpl5 {
    static void TMConstructor(){
        SortedMap<Integer, String> sMap=new ConcurrentSkipListMap<>();
        sMap.put(0, "Linux");
        sMap.put(1, "Windows");
        sMap.put(2, "Android");
        TreeMap<Integer, String> tMap=new TreeMap<>(sMap);
        System.out.println("tMap = "+tMap);
    }
    public static void main(String[] args) {
        TMConstructor();
    }
}
