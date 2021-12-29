import java.util.ArrayList;
import java.util.HashSet;

public class HSCallObjStrg {
    public static void main(String[] args) {
        HashSet<ArrayList> hSet=new HashSet<>();
        ArrayList<Integer> aList=new ArrayList<>();
        ArrayList<Integer> aList2=new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList2.add(1);
        aList2.add(2);
        hSet.add(aList);
        hSet.add(aList2);
        System.out.println("HashSet Size = "+hSet.size());
        System.out.println("ArrayList 1 = "+aList);
        System.out.println("ArrayList 2 = "+aList2);
        System.out.println("HashSet = "+hSet);
    }
}
