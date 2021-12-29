import java.util.ArrayList;

public class AL4Each2 {
    public static void main(String[] args) {
        ArrayList<String> aList=new ArrayList<String>();
        aList.add("Yoga");
        aList.add("David");
        aList.add("Fajar");
        System.out.print("Serdadu Revolusioner = ");
        aList.forEach((n)->print(n));
        }
    public static void print(String n){
        System.out.print(n+", ");
    
    }
}
