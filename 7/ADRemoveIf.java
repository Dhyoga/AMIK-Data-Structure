import java.util.ArrayDeque;

public class ADRemoveIf {
    public static void main(String[] args) {
        ArrayDeque<String> hommies=new ArrayDeque<String>();
        hommies.add("Dhyoga");
        hommies.add("Yoga");
        System.out.println("Anggota hommies adalah "+hommies);
        hommies.removeIf(n->n.charAt(1)=='h');
        System.out.print("Hommies yang huruf keduanya bukan 'h' adalah ");
        for(String h:hommies){
            System.out.print(h);
        }
    }
}
