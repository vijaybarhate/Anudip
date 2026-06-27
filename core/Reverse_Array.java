// Program to accept 5 numbers from the user and print them back in reverse order

// Import Scanner class for reading keyboard input
import java.util.Scanner;

// Public class Reverse_Array — demonstrates forward input and reverse output using arrays
public class Reverse_Array {
    // main() method — execution starts here
    public static void main(String[] args) {
        // Create an integer array with 5 slots (indices 0, 1, 2, 3, 4)
        int a[] = new int[5];

        // Create a Scanner to read user input from the console
        Scanner sc = new Scanner(System.in);
        // Prompt the user for five numbers
        System.out.println("Enter five numbers : ");
        // Declare loop counter 'i' outside the loops so it can be reused
        int i;

        // === LOOP 1: FILL THE ARRAY (FORWARD) ===
        // Indices used: 0, 1, 2, 3, 4 (in increasing order)
        for (i = 0; i < 5; i++) {
            // Read the next integer and store it at the current index 'i'
            a[i] = sc.nextInt();
        }

        // === LOOP 2: DISPLAY NUMBERS AS ENTERED ===
        // Print each value back to the user in the original order
        for (i = 0; i < 5; i++) {
            System.out.println("You entered : " + a[i]);
        }

        // Announce that we are about to print the reversed sequence
        System.out.println("Printing in Reverse Order:");

        // === LOOP 3: REVERSE ORDER OUTPUT ===
        // Start at index 4 (the last element of the array)
        // Continue as long as 'i' is 0 or greater
        // Decrement 'i' by 1 each iteration to move backwards through the array
        for (i = 4; i >= 0; i--) {
            // Prints elements in reverse order: a[4], a[3], a[2], a[1], a[0]
            System.out.println("Reversed : " + a[i]);
        }

        // Close the Scanner to release the input stream resource
        sc.close();
    }
}
