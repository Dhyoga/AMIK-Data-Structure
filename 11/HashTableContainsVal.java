import java.util.Hashtable;

import javax.sound.midi.SysexMessage;

public class HashTableContainsVal {
    public static void main(String[] args) {
        Hashtable<Integer, String> h=new Hashtable<>();
        h.put(2142029, "Dhyoga");
        h.put(29102002, "Yoga");
        h.put(29102021, "Permana");
        if (h.containsValue("Dhyofa")) {
            System.out.println("Dhyoga ketemu");
        }else{
            System.out.println("Dhyoga tidak ketemu");
        }
        if (h.containsValue("Yoga Permana")) {
            System.out.println("Yoga Permana ada");
        }else{
            System.out.println("Yoga Permana tidak ada");
        }
    }
}