import java.lang.reflect.Array;
public class ArrSet{
    public static void main(String[] args){
        String s[]={"Java", " is ", "Java"};
        for(String x:s){
            System.out.print(x);
        }
        Array.set(s,1," for ");
        System.out.print("\nAfter Set: ");
        for(String x:s){
            System.out.print(x);
        }
        System.out.println();
    }
}