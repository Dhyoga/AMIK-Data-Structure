import java.util.ArrayList;

public class AL4Each {
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<>();
        aList.add(29);
        aList.add(10);
        aList.add(2002);
        aList.forEach((n)->System.out.println(n));
    }
}
