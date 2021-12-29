import java.util.ArrayDeque;

public class AccesElmArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> de_que=new ArrayDeque<String>();
        de_que.add("Happy");
        de_que.add("Birthday");
        de_que.add("Yoga");
        de_que.add("'Dhyoga'");
        de_que.add("Permana");

        System.out.println("ArrayDeque = "+de_que);
        System.out.println("Elemen pertama adalah "+de_que.getFirst());
        System.out.println("Elemen terakhir adalah "+de_que.getLast());
    }
}
