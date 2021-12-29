public class InitVarArray_5{
    public static void main(String... args){
        //String[] array={"1", "2", "3","4","5"};
        System.out.println("1234567812345678");
        System.out.println("=====================");
        System.out.printf("%8s%8s%8s\n","Index","Value","Pangkat");
        for(int cc=0;cc<args.length;cc++)
        System.out.printf("%8s%8s%8s\n",cc, args[cc], Math.pow(Integer.valueOf(args[cc]), cc));
    }
}