// Import the utility package to get access to ArrayList and other collection classes
import java.util.*;

// Declare a public class named Array_List1 — the file name must match this class name
public class Array_List1 {
    // The main() method is the entry point — JVM starts execution from here
    public static void main(String[] args) {
        // Create an ArrayList that can only hold String values
        // ArrayList grows and shrinks automatically — no fixed size limit
        ArrayList<String> list = new ArrayList<>();

        // Add employee names one by one into the ArrayList
        list.add("Vijay");  // Append "Vijay" at index 0
        list.add("Rushi");  // Append "Rushi" at index 1
        list.add("Prasad"); // Append "Prasad" at index 2
        list.add("miraj");  // Append "miraj" at index 3
        list.add("harsh");  // Append "harsh" at index 4

        // Print a heading before displaying the list contents
        System.out.println("your employee list is :");

        // Enhanced for-each loop — iterates over every element in 'list'
        // In each iteration 'name' automatically gets the next element
        for (String name : list) {
            // Print the current employee name on a new line
            System.out.println(name);
        }
    }
}
