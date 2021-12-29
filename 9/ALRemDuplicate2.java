import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ALRemDuplicate2 {
    public static void main(String[] args) {
        List<Integer> aList=new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("Array with duplicate = "+aList);
        List<Integer> newlist=aList.stream().distinct().collect(Collectors.toList());    
        System.out.println("Array without duplicate = "+newlist);
    }
}
