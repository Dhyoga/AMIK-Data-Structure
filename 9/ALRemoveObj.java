import java.util.ArrayList;
import java.util.List;

public class ALRemoveObj {
    public static void main(String[] args) {
        List<Integer> aList=new ArrayList<Integer>();
        aList.add(29);;
        aList.add(10);
        aList.add(2002);
        aList.add(2021);
        System.out.println("Array = "+aList);
        aList.remove(new Integer(2021));
        System.out.println("Array = "+aList);
    }
}
