import java.util.HashMap;

public class HMGet {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Yoga", 70);
        map.put("Dhyoga", 80);
        map.put("Permana", 90);
        System.out.println("Map Size = "+map.size());
        System.out.println("Map = "+map);
        if (map.containsKey("Dhyoga")) {
            System.out.println("Nilai Dhyoga adalah "+map.get("Dhyoga"));
        }
    }
}
