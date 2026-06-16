import java.util.*;

public class Dynamic_Array {
    public static void main(String[] args) {
        // Define an array with 5 empty slots
        int a[] = new int[5];
        int i;
        
        // Initialize Scanner to read keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five values : ");

        // Step 1: Input Phase
        // Loop runs from index 0 to 4 to fill the array
        for (i = 0; i < 5; i++) {
            // Take the number typed by user and put it in slot 'i'
            a[i] = sc.nextInt();
        }

        System.out.println("You have entered the following values :");
        
        // Step 2: Output Phase
        // Loop runs through the array again to print each stored value
        for (i = 0; i < 5; i++) {
            // Print the value at the current index 'i'
            System.out.println(a[i]);
        }
        
        sc.close(); // Good practice to close the scanner
    }
}
