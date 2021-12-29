import java.util.TreeMap;

public class TMContainsKey {
    public static void main(String[] args) {
        TreeMap<String, Integer> tMap=new TreeMap<>();
        tMap.put("Arch", 0);
        tMap.put("Debian", 1);
        tMap.put("Fedora", 2);
        System.out.println("Size Map = "+tMap.size());
        System.out.println("Map = "+tMap);
        if (tMap.containsKey("Debian")) {
            System.out.println("Value for key \"Debian\" adalah "+tMap.get("Debian"));
        }
    }
}