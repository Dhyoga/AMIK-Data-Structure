import java.util.*;
public class InitObjectArray3{
    public static void main(String[] args){
        Object[] array=new Double[10];
        System.out.printf("%8s%8s\n", "Index", "Value");
        try{
            for(int cc=0;cc<array.length;cc++){
                if(array[cc]==null) array[cc]=0.0;
                System.out.printf("%8s%8.2f\n", cc, array[cc]);
            }
        }catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
    }
}