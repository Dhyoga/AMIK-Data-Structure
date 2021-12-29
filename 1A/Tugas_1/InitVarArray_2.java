public class InitVarArray_2{
    public static void main(String... array){
        if (array.length==0){
            System.out.println("Type n arguments:");
        }else{
            System.out.println("1234567812345678");
            System.out.println("=====================");
            System.out.printf("%8s%8s\n","Index","Value");
            for(int cc=array.length-1;cc>=0;cc--)
            System.out.printf("%8s%8s\n",cc, array[cc]);
        }
    }
}