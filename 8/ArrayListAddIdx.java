import java.util.ArrayList;

public class ArrayListAddIdx {
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<Integer>();
        aList.add(29);
        aList.add(10);
        aList.add(2142029);
        aList.add(2,2002);
        for (Integer alice : aList) {
            System.out.println("ArrayList = "+alice);
        }
    }
}
