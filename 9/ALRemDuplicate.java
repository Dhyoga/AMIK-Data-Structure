import java.util.ArrayList;
import java.util.Arrays;

public class ALRemDuplicate {
    public static <T>ArrayList<T> removeDuplicate(ArrayList<T> aList){
        ArrayList<T> newList=new ArrayList<>();
        for (T element : aList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("Array with duplicate = "+aList);
        ArrayList<Integer> newList=removeDuplicate(aList);
        System.out.println("Array without duplicate = "+newList);
    }
    
}