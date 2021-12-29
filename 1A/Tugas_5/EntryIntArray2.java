import java.util.Scanner;
public class EntryIntArray2{
    public static void entry(Scanner kb, int array[]){
        System.out.println("entry:"+ array.length+" integer (separated by space)");
    for(int cc=0;cc<array.length;cc++)
        array[cc]=kb.nextInt();
    }
    public static void display(int array[]){
        System.out.printf("%8s%8s\n", "Index", "Value");
        for(int cc=0;cc<array.length;cc++)
            System.out.printf("%8s%8s\n", cc, array[cc]);
    }
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int Max=10,size;
        System.out.println("entry size (max 10):");
        size=kb.nextInt();
        if(size>Max) size=Max;
        int[] array=new int[size];
        entry(kb,array);
        display(array);
    }
}