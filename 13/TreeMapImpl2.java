import java.util.TreeMap;

public class TreeMapImpl2 {
    static void TMConstructor(){
        TreeMap<Integer, String> tMap=new TreeMap<>();
        tMap.put(0, "Redstone 2");
        tMap.put(1, "Redstone 5");
        tMap.put(2, "21H2");
        System.out.println("tMap = "+tMap);
    }
    public static void main(String[] args) {
        TMConstructor();
    }
}
