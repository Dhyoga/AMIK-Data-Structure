import java.util.*;
public class EntryInitObjectArray4{
    public static void entry(Scanner Entri, Object array[]){
        System.out.println("entry:"+ array.length+" Char (separated by space)");
    for(int cc=0;cc<array.length;cc++)
        array[cc]=Entri.next().charAt(0);
    }
    public static void main(String[] args){
        Scanner Entri=new Scanner(System.in);
        Object[] array=new Character[10];
        entry(Entri, array);
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