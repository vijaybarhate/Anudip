// Import only the Scanner class (specific import — no need for the entire java.util package)
import java.util.Scanner;

// Public class Min_Max — finds the smallest and largest number from 5 user-provided values
public class Min_Max {
    // main() method — called when the program starts
    public static void main(String[] args) {
        // Create an integer array with 5 slots to store the user's numbers
        int a[] = new int[5];

        // Create a Scanner connected to System.in for reading keyboard input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers : ");
        // Declare loop counter 'i' outside the loops for reuse
        int i;

        // === LOOP 1: COLLECT INPUT ===
        // Iterate from index 0 to 4, storing each entered number in the array
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // === LOOP 2: CONFIRMATION ===
        // Display each entered value back to the user for verification
        for (i = 0; i < 5; i++) {
            System.out.println("You entered : " + a[i]);
        }

        // === LOGIC TO FIND MINIMUM AND MAXIMUM ===

        // Step 1: Assume the very first element (a[0]) is BOTH the smallest and largest
        // These will be updated as we compare with the remaining elements
        int min = a[0];
        int max = a[0];

        // Step 2: Loop through the rest of the array starting from index 1 (second element)
        for (i = 1; i < 5; i++) {
            // If the current element is GREATER than our current max, update max
            if (a[i] > max) {
                max = a[i];
            }
            // If the current element is SMALLER than our current min, update min
            if (a[i] < min) {
                min = a[i];
            }
        }

        // Step 3: Print the final computed results
        System.out.println("Maximum Element : " + max);
        System.out.println("Minimum Element : " + min);

        // Release the Scanner resource
        sc.close();
    }
}
