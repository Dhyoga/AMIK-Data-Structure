import java.util.ArrayList;

public class ALRemClear {
    public static void main(String[] args) {
        ArrayList<String> aList=new ArrayList<>();
        aList.add("Data");
        aList.add("Structure");
        aList.add("IF-A");
        System.out.println("Array = "+aList);
        System.out.println("Size = "+aList.size());
        aList.clear();
        System.out.println("Array After Remove = "+aList);
        System.out.println("Size = "+aList.size());
    }
}
