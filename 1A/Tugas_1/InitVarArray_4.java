public class InitVarArray_4{
    public static void main(String... array){
        if (array.length==0){
            System.out.println("Type n arguments:");
        }else{
            System.out.println("1234567812345678");
            System.out.println("=====================");
            System.out.printf("%8s%8s\n","Index","Value");
            for(int cc=1;cc<array.length;cc+=2)
            System.out.printf("%8s%8s\n",cc, array[cc]);
        }
    }
}