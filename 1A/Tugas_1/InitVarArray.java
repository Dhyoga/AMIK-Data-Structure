public class InitVarArray{
    public static void main(String... array){
        if (array.length==0){
            System.out.println("Argumennya ketik dulu njirr");
        }else{
            System.out.printf("%8s%8s\n","Index","Value");
            for(int cc=0;cc<array.length;cc++)
            System.out.printf("%8s%8s\n",cc, array[cc]);
        }
    }
}