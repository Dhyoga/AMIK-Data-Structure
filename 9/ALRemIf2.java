import java.util.ArrayList;

public class ALRemIf2 {
    public static void main(String[] args) {
        ArrayList<String> alist=new ArrayList<>();
        alist.add("David");
        alist.add("Fajar");
        alist.add("Yoga");
        alist.add("Dhyoga");
        alist.removeIf(n->n.charAt(0)=='Y');
        for (String string : alist) {
            System.out.println(string);
        }
    }
}
