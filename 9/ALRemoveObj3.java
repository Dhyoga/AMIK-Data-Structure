import java.util.ArrayList;
import java.util.List;

public class ALRemoveObj3 {
    public static void main(String[] args) {
        List<Integer> aList=new ArrayList<>();
        aList.add(29);
        aList.add(10);
        aList.add(2002);
        aList.add(2021);
        System.out.println("Array = "+aList);
        aList.remove(0);
        System.out.println("Array = "+aList);
        aList.remove(0);
        System.out.println("Array = "+aList);
    }
}
