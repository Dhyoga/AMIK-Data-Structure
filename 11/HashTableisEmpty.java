import java.util.Hashtable;

public class HashTableisEmpty {
    public static void main(String[] args) {
        Hashtable<Integer, String> h=new Hashtable<>();
        h.put(0, "STMIK");
        h.put(1, "AMIKBANDUNG");
        if (h.isEmpty()) {
            System.out.println("Hashtable kosong");
        }else{
            System.out.println("Hashtable tidak kosong");
        }
        h.clear();
        if (h.isEmpty()) {
            System.out.println("Hashtable sekarang kosong");
        }else{
            System.out.println("Hashtable tidak kosong");
        }
    }
}
