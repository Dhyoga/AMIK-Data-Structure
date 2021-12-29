import java.util.TreeMap;

public class TMUpdt {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap1=new TreeMap<>();
        tMap1.put(1, "XFCE");
        tMap1.put(2, "KDE Plasma");
        tMap1.put(3, "Gnome");
        System.out.println(tMap1);
        tMap1.put(3, "GNOME");
        System.out.println(tMap1);
    }    
}
