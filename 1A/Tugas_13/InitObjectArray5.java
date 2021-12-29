import java.util.*;
public class InitObjectArray5{
    public static void main(String[] args){
        Object[] array=new String[10];
        System.out.printf("%8s%8s\n", "Index", "Value");
        try{
            for(int cc=0;cc<array.length;cc++){
                if(array[cc]==null) array[cc]="";
                System.out.printf("%8s%8s\n", cc, array[cc]);
            }
        }catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
    }
}