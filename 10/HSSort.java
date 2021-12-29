import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HSSort {
    public static void main(String[] args) {
        HashSet<String> hSet=new HashSet<String>();
        hSet.add("Fajar");
        hSet.add("Yoga");
        hSet.add("David");
        System.out.println("Original = "+hSet);
        List<String> list=new ArrayList<>(hSet);
        Collections.sort(list);
        System.out.println("Mengurut HashSet elemen dengan List = "+list);
    }
}
