import java.util.HashMap;

public class HMChangeElm {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(0, "Data");
        hm.put(1, "Structure");
        hm.put(2, "IF");
        System.out.println("Initial Map = "+hm);
        hm.put(2, "IF-A");
        System.out.println("Updated Map = "+hm);
    }
}
