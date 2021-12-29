import java.util.ArrayList;

public class ALRemAll {
    public static void main(String[] args) {
        ArrayList<String> aList=new ArrayList<>();
        aList.add("Data");
        aList.add("Structure");
        aList.add("IF-A");
        System.out.println("Array = "+aList);
        System.out.println("Size = "+aList.size());
        aList.removeAll(aList);
        System.out.println("Array After Remove = "+aList);
        System.out.println("Size = "+aList.size());
    }
}
