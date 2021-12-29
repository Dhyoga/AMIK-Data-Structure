import java.util.Hashtable;

public  class HashTablePut {
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable<>();
        h.put(3, "Structure");
        h.put(1, "IF-A");
        h.put(2, "Data");
        System.out.println(h);
    }
}
