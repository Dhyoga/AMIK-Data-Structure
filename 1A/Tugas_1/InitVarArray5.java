import java.lang.Math;
public class InitVarArray5{
    public static void main(String... array){
        if (array.length==0){
            System.out.println("Type n arguments");
        }else{
            System.out.println("1234567812345678");
            System.out.println("=====================");
            System.out.printf("%8s%8s%8s\n","Index","Value","Pangkat");
            for(int cc=0;cc<array.length;cc++)
            System.out.printf("%8s%8s%8s\n",cc, array[cc], Math.pow(Integer.valueOf(array[cc]), cc));
        }
    }
}