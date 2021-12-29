import java.util.TreeMap;

public class TMPut {
    public static void main(String[] args) {
        TreeMap <Integer, String> tm1=new TreeMap<>();
        tm1.put(1, "bspwm");
        tm1.put(2, "dwm");
        tm1.put(3, "i3-gaps");
        TreeMap<Integer, String> tm2=new TreeMap<>();
        tm2.put(new Integer(1), "bspwm");
        tm2.put(2, "dwm");
        tm2.put(3, "i3-gaps");
        System.out.println(tm1);
        System.out.println(tm2);
        System.out.println("Apakah sama? "+tm1.equals(tm2));
    }    
}