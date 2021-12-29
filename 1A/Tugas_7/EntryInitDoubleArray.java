import java.util.*;
public class EntryInitDoubleArray{
    public static void entry(Scanner keyboard, double array[]){
        System.out.println("entry:"+ array.length+" double (separated by space)");
    for(int cc=0;cc<array.length;cc++)
        array[cc]=keyboard.nextDouble();
    }
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        double[] array=new double[10];
        entry(keyboard, array);
        System.out.printf("%8s%8s\n", "Index", "Value");
        try {
            for(int cc=0;cc<array.length;cc++){
                System.out.printf("%8s%8s\n", cc, array[cc]);
            }
        } catch (MissingFormatArgumentException e) {
            System.out.println(e);
        }
    }
}