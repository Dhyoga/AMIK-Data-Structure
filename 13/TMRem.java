import java.util.TreeMap;

public class TMRem {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap=new TreeMap<>();
        tMap.put(0, "XFCE");
        tMap.put(1, "Mate");
        tMap.put(2, "Cinnamon");
        System.out.println(tMap);
        tMap.remove(0);
        System.out.println(tMap);
    }
}
