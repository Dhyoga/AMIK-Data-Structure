import java.util.LinkedList;
public class LLGet{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("Linked");
        list.add("4");
        list.add("List");
        list.add("8");
        System.out.println("The elements in List are : "+list);
        System.out.println("Element at index 3 is : "+list.get(3));
    }
}