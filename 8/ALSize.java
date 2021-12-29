import java.util.ArrayList;

public class ALSize {
    public static void main(String[] args) throws Exception{
        try {
            ArrayList<Integer> arrlist=new ArrayList<Integer>();
            arrlist.add(29);
            arrlist.add(10);
            arrlist.add(2002);
            arrlist.add(2142029);
            System.out.println("ArrayList = "+arrlist);
            System.out.println("Size = "+arrlist.size());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: "+e);
        }
    }
}
