// Import all classes from java.util (Scanner for input)
import java.util.*;

// Public class Dynamic_Array — demonstrates accepting array input from the user at runtime
public class Dynamic_Array {
    // main() method — execution starts here
    public static void main(String[] args) {
        // Declare an integer array with 5 slots (indices 0 through 4)
        // The values will be filled later based on user input
        int a[] = new int[5];
        // Declare loop variable 'i' outside the loops so it can be reused
        int i;

        // Create a Scanner object to read what the user types on the keyboard
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter five numeric values
        System.out.println("Enter five values : ");

        // === Step 1: INPUT PHASE ===
        // Loop from i = 0 to i = 4 (5 iterations total)
        for (i = 0; i < 5; i++) {
            // Read the next integer from the keyboard and store it at the current index 'i'
            a[i] = sc.nextInt();
        }

        // Inform the user that we are about to display the stored values
        System.out.println("You have entered the following values :");

        // === Step 2: OUTPUT PHASE ===
        // Loop through the array again, this time printing each stored value
        for (i = 0; i < 5; i++) {
            // Print the element located at the current index 'i' on a new line
            System.out.println(a[i]);
        }

        // Close the Scanner to release the System.in resource
        sc.close();
    }
}
