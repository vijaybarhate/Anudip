// Import all classes from java.util package (Scanner, ArrayList, etc.)
import java.util.*;

// Public class Average — computes the average of four user-provided numbers
public class Average {
    // main() method — program entry point
    public static void main(String[] args) {
        // Declare an integer array with 4 slots to hold the user's numbers
        // Index positions: 0, 1, 2, 3
        int a[] = new int[4];

        // Create a Scanner object linked to System.in to read keyboard input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter four numbers
        System.out.println("Enter four numbers : ");

        // Initialize a float variable 'sum' to 0 — will accumulate the total
        float sum = 0;

        // Loop exactly 4 times (i = 0, 1, 2, 3) to collect each input number
        for (int i = 0; i < 4; i++) {
            // Read the next integer from the user and store it at index 'i' of the array
            a[i] = sc.nextInt();
            // Add the newly entered number to the running total stored in 'sum'
            sum = sum + a[i];
        }

        // Calculate the average by dividing the total sum by 4 (the count of numbers)
        // The division is done in float since 'sum' is declared as float
        System.out.println("Average : " + sum / 4);

        // Close the Scanner to free the underlying input stream resource
        sc.close();
    }
}
