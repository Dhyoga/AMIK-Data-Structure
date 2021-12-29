import java.util.*;
public class InitCharArray{
    public static void main(String[] args){
        char[] Array=new char[10];
        System.out.printf("%8s%8s\n", "Index", "Value");
        try{
            for(int cc=0;cc<Array.length;cc++){
                if(Array[cc]==' ') Array[cc]='\b';
                System.out.printf("%8s%8s\n", cc, Array[cc]);
            }
        }catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
    }
}