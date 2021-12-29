import java.util.*;
public class InitObjectArray4{
    public static void main(String[] args){
        Object[] array=new Character[10];
        System.out.printf("%8s%8s\n", "Index", "Value");
        try{
            for(int cc=0;cc<array.length;cc++){
                if(array[cc]==null) array[cc]='\b';
                System.out.printf("%8s%8c\n", cc, array[cc]);
            }
        }catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
    }
}