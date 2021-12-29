import java.util.*;
public class EntryInitObjectArray5{
    public static void entry(Scanner Entri, Object array[]){
    System.out.println("entry:"+ array.length+" String (separated by space)");
    for(int cc=0;cc<array.length;cc++)
        array[cc]=Entri.nextLine();
    }
    public static void main(String[] args){
        Scanner Entri=new Scanner(System.in);
        Object[] array=new String[10];
        entry(Entri, array);
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