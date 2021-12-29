import java.util.ArrayList;

public class ArrayListAddAllIdx {
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<Integer>();
        aList.add(29);
        aList.add(10);
        aList.add(2002);
        System.out.println("ArrayList1 = "+aList);

        ArrayList<Integer> aList2=new ArrayList<Integer>();
        aList2.add(1);
        aList2.add(2);
        aList2.add(3);
        aList2.add(4);
        System.out.println("ArrayList2 = "+aList2);

        aList.addAll(aList2);
        System.out.print("ArrayList = ");
        for (Integer alice : aList) {
            System.out.print(alice+", ");
        }
    }
}
