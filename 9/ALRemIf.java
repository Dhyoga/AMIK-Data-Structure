import java.util.ArrayList;

public class ALRemIf {
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<>();
        aList.add(23);
        aList.add(32);
        aList.add(45);
        aList.add(63);
        aList.removeIf(n -> (n%3!=0));
        for (Integer i : aList) {
            System.out.println(i);
        }
    }
}