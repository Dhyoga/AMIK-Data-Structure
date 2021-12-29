import java.util.HashSet;

public class HashSetRemove {
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
        System.out.println("Sebelum = "+hSet);
        hSet.remove("xxx");
        System.out.println("Setelah remove elemen "+hSet);
        System.out.println("Element xxx ada di HashSet = "+hSet.contains("xxx"));
    }
}
