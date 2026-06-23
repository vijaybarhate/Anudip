// Import the utility package to get access to ArrayList and other collection classes
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        // Create an ArrayList that can only hold String values
        // ArrayList grows and shrinks automatically — no fixed size limit
        ArrayList<String> list = new ArrayList<>();

        // Add employee names one by one into the ArrayList
        list.add("Vijay");    // Index 0
        list.add("Rushi");    // Index 1
        list.add("Prasad");   // Index 2
        list.add("miraj");    // Index 3
        list.add("harsh");    // Index 4

        System.out.println("your employee list is :");

        // Enhanced for-each loop — iterates over every element in 'list'
        // 'name' holds one element per loop cycle
        for (String name : list) {
            System.out.println(name); // Print the current employee name
        }
    }
}
