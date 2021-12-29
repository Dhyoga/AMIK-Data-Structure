import java.util.*;
public class EntryInitFloatArray{
    public static void entry(Scanner Entri, float array[]){
        System.out.println("entry:"+ array.length+" float (separated by space)");
    for(int cc=0;cc<array.length;cc++)
        array[cc]=Entri.nextFloat();
    }
    public static void main(String[] args) {
    Scanner Entri=new  Scanner(System.in);
    float[] array=new float[10];
        entry(Entri, array);
        System.out.printf("%8s%8s\n", "Index","Value");
        try{
             for(int cc=0;cc<array.length;cc++)
                System.out.printf("%8s%8s\n",cc,array[cc]);
            }catch(MissingFormatArgumentException e){
                System.out.println(e);
            }
    }
}