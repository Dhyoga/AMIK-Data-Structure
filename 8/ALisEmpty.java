import java.util.ArrayList;

public class ALisEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        boolean ans=arr.isEmpty();
        if (ans==true) {
            System.out.println("ArrayList kosong");
        }else{
            System.out.println("ArrayList tidak kosong");
        }
        arr.add(0);
        ans=arr.isEmpty();
        if (ans==true) {
            System.out.println("ArrayList kosong");
        }else{
            System.out.println("ArrayList tidak kosong");
        }
    }
}
