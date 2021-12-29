import java.util.ArrayList;
import java.util.List;

public class LvsAL{
    public static void main(String[] args){
        List<String> aL1=new ArrayList<String>();
        aL1.add("Data");
        aL1.add("Structure");
        aL1.add("IF-A");
        System.out.println(aL1);
        ArrayList<String> aL2=new ArrayList<String>();
        aL2.add("Yoga");
        aL2.add("\"Dhyoga\"");
        aL2.add("Permana");
        System.out.println(aL2);
        System.out.println(aL1.equals(aL2));
    }
}