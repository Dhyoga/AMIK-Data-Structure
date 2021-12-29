import java.util.*;
public class InitDoubleArray{
    public static void main(String[] args){
        double[] array=new double[10];
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