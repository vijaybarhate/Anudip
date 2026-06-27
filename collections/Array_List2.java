
// Import the utility package to get access to ArrayList, Scanner and other classes
import java.util.*;

public class Array_List2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList that can only hold String values
        // ArrayList grows and shrinks automatically — no fixed size limit
        ArrayList<String> list = new ArrayList<>();

        // Ask the user how many names they want to enter
        System.out.print("Enter the number of employees: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        // Loop from 0 up to size-1, collecting names one by one
        for (int i = 0; i < size; i++) {
            System.out.print("Enter employee name " + (i + 1) + ": ");
            String name = sc.nextLine(); // Read the name from the user
            list.add(name); // Append it to the ArrayList
        }

        System.out.println("Your employee list is :");

        // Enhanced for-each loop — iterates over every element in 'list'
        // 'n' holds one element per loop cycle
        for (String n : list) {
            System.out.println(n); // Print the current employee name
        }

        sc.close(); // Close the scanner to free resources
    }
}
