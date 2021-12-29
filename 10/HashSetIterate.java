import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {
    public static void main(String[] args) {
        HashSet<String> hSet=new HashSet<>();
        String s0="0", s1="1", s2="2", s3="3", s4="4", s5="5", s6="6", s8="8", s9="9";
        hSet.add(s0);
        hSet.add(s8);
        hSet.add(s1);
        hSet.add(s2);
        hSet.add(s3);
        hSet.add(s2);
        hSet.add(s6);
        hSet.add(s9);
        hSet.add("xxx");
        Iterator itr=hSet.iterator();
        System.out.print("Iterate = ");
        while (itr.hasNext()) {
            System.out.print(itr.next()+", ");
        }
        System.out.println();
        System.out.print("for = ");
        for (String s : hSet) {
            System.out.print(s+", ");
        }
        System.out.println();
    }
}
