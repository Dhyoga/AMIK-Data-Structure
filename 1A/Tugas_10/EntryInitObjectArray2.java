import java.util.*;
public class EntryInitObjectArray2{
    public static void entry(Scanner Entri, Object array[]){
        System.out.println("entry:"+ array.length+" Float (separated by space)");
    for(int cc=0;cc<array.length;cc++)
        array[cc]=Entri.nextFloat();
    }
    public static void main(String[] args){
        Scanner Entri=new Scanner(System.in);
        Object[] array=new Float[10];
        entry(Entri, array);
        System.out.printf("%8s%8s\n", "Index", "Value");
        try{
            for(int cc=0;cc<array.length;cc++){
                if(array[cc]==null) array[cc]=0.0f;
                System.out.printf("%8s%8.2f\n", cc, array[cc]);
            }
        }catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
    }
}