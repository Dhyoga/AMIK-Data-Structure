import java.util.ArrayList;

public class ALRemove{
    public static void main(String[] args){
        ArrayList<Integer> aList=new ArrayList<Integer>();
        aList.add(29);
        aList.add(10);
        aList.add(2002);
        aList.add(2021);
        System.out.println("Array = "+aList);
        System.out.println("Array Size = "+aList.size());
        int index=aList.size()-1;
        aList.remove(index);
        System.out.println("Remove Index 3");
        System.out.println("Array = "+aList);
    }
}