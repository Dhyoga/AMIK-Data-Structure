import java.util.HashSet;

public class HashSetClear {
    public static void main(String[] args) {
        HashSet<String> hSet=new HashSet<>();
        String s0="0", s1="1", s2="2", s3="3", s4="4", s6="6", s8="8", s9="9";
        hSet.add(s0);
        hSet.add(s8);
        hSet.add(s1);
        hSet.add(s2);
        hSet.add(s3);
        hSet.add(s6);
        hSet.add(s9);
        hSet.add("xxx");
        System.out.println("Sebelum = "+hSet);
        System.out.println("Apa ada angka "+s2+" = "+hSet.contains(s2));
        System.out.println("Apa ada angka "+s4+" = "+hSet.contains(s4));
        System.out.println("Apa ada angka "+s6+" = "+hSet.contains(s6));
        System.out.println("clear");
        hSet.clear();
        System.out.println("Setelah = "+hSet);
        System.out.println("Apa ada angka "+s2+" = "+hSet.contains(s2));
    }
}
