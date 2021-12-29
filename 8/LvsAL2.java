import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LvsAL2 {
    public static void main(String[] args) {
        List<String> aL1=new ArrayList<String>();
        Arrays.asList("Data", "Structure", "IF-A");
        System.out.println(aL1);
        ArrayList<String> aL2=new ArrayList<String>();
        Arrays.asList("Yoga","\"Dhyoga\"","Permana");
        System.out.println(aL2);
        System.out.println(aL1.equals(aL2));
    }
}
