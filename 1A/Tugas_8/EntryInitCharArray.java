import java.util.*;
public class EntryInitCharArray{
    public static void entry(Scanner input, char array[]){
        System.out.println("entry:"+ array.length+" char (separated by space)");
    for(int cc=0;cc<array.length;cc++)
        array[cc]=input.next().charAt(0);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char[] Array=new char[10];
        entry(input, Array);
        System.out.printf("%8s%8s\n", "Index", "Value");
        try{
            for(int cc=0;cc<Array.length;cc++){
                if(Array[cc]==' ') Array[cc]='\b';
                System.out.printf("%8s%8s\n", cc, Array[cc]);
            }
        }catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
    }
}