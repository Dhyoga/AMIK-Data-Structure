import java.util.HashMap;

public class HMContainsKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("W", 0);
        map.put("A", 1);
        map.put("S", 2);
        map.put("D", 3);
        System.out.println("Map Size = "+map.size());
        System.out.println("Map = "+map);
        if (map.containsKey("D")) {
            System.out.println("Nilai D adalah "+map.get("D"));
        }
    }
}
