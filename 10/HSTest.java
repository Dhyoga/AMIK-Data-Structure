import java.util.HashSet;

public class HSTest {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        boolean b1=hs.add("Hash");
        boolean b2=hs.add("Set");
        boolean b3=hs.add("Hash");
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
        System.out.println(hs);
    }
}
