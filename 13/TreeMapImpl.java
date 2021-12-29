import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {
    static TreeMap<Integer, String> tMap=new TreeMap<>();
    static void create(){
        System.out.println("tMap berhasil dibuat!");
    }
    static void insert(){
        tMap.put(0, "BlankOn");
        tMap.put(1, "Kali Linux");
        tMap.put(2, "Mint");
        System.out.println("Elemen berhasil ditambahkan!");
    }
    static void search(int key){
        System.out.println("Apakah key "+key+" ada di tMap? "+tMap.containsKey(key));
    }
    static void search(String value){
        System.out.println("Apakah value "+value+" ada di Tmap? "+tMap.containsValue(value));
    }
    static void display(){
        System.out.println("tMap = "+tMap);
    }
    static void traverse(){
        for (Map.Entry<Integer, String> eMap: tMap.entrySet()) {
            System.out.println(eMap.getKey()+" : "+eMap.getValue());
        }
    }
    public static void main(String[] args) {
        create();
        insert();
        search("BlankOn");
        search(1);
        display();
        traverse();
    }
}