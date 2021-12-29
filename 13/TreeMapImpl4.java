import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl4 {
    static void TMConstructor(){
        Map<Integer, String> tMap=new HashMap<>();
        tMap.put(0, "21H2");
        tMap.put(1, "Mint 20.2 XFCE");
        tMap.put(2, "Mint 20.2 i3-gaps");
        TreeMap<Integer, String> treeMap=new TreeMap<>(tMap);
        System.out.println(treeMap);
    }
    public static void main(String[] args) {
        TMConstructor();
    }
}
