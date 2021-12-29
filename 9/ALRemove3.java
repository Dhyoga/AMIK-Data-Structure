import java.util.ArrayList;
import java.util.Iterator;

public class ALRemove3{
    public static void main(String[] args){
        ArrayList<Integer> aList=new ArrayList<Integer>();
        aList.add(29);
        aList.add(10);
        aList.add(2002);
        aList.add(2021);
        System.out.println("Array = "+aList);
        System.out.println("Array Size = "+aList.size());
        Iterator itr=aList.iterator();
        while (itr.hasNext()) {
            int x=(Integer)itr.next();
            if(x<2000)
            itr.remove();
        }
        System.out.println("Array = "+aList);
    }
}