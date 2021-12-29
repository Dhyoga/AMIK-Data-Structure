import java.util.Scanner;
public class EntryIntArray{
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int size=10;
        int[] array=new int[size];
        init(array, size);
        entry(kb, array);
        display(array);
    }
    public static void init(int array[], int size) {
        System.out.printf("%8s%8s\n", "Index", "Value");
        for(int cc=0;cc<array.length;cc++)
        System.out.printf("%8s%8s\n", cc, array[cc]);
    }
    public static void entry(Scanner kb, int array[]) {
        System.out.println("Entry   = "+array.length+"integer(separated by space)");
        for(int cc=0;cc<array.length;cc++)
        array[cc]=kb.nextInt();
    }
    public static void display(int array[]) {
        System.out.printf("%8s%8s\n", "Index", "Value");
        for(int cc=0;cc<array.length;cc++)
        System.out.printf("%8s%8s\n", cc, array[cc]);
    }
}