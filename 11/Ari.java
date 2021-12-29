// Java code to illustrate the contains() method 
import java.util.*; 
 
public class Ari { 
 public static void main(String[] args) 
 { 
 
 // Creating an empty Hashtable 
 Hashtable<Integer, String> hash_table = 
 new Hashtable<Integer, String>(); 
 String s1="Data", s2="Base"; 
 // Mapping string values to int keys 
 hash_table.put(10, s1); 
 hash_table.put(15, "Structure"); 
 hash_table.put(20, "4"); 
 hash_table.put(25, "IF"); 
 hash_table.put(30, "AZ"); 
 
 // Displaying the HashMap 
 System.out.println("Initial Table is: " + hash_table); 
 
 // Checking for the Value s1 
 System.out.println("Is the value '"+s1+"' present? " + 
 hash_table.contains(s1)); 
 
 // Checking for the Value s2 
 System.out.println("Is the value '"+s2+"' present? " + 
 hash_table.contains(s2)); 
 } 
}