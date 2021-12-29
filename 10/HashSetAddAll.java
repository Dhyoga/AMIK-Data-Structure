import java.util.ArrayList;
import java.util.HashSet;

public class HashSetAddAll {
    public static void main(String[] args) {
        HashSet<String> hSet=new HashSet<>();
        hSet.add("0");
        hSet.add("8");
        hSet.add("1");
        hSet.add("2");
        hSet.add("3");
        System.out.println("Initial Set = "+hSet);
 
        ArrayList<String> aList=new ArrayList<String>();
        aList.add("2");
        aList.add("6");
        aList.add("9");
        aList.add("x");
        aList.add("x");
        aList.add("x");
        hSet.addAll(aList);
        System.out.println("Final Set = "+hSet);
    }   
}
