import java.util.*;

public class Average {
    public static void main(String[] args) {
        // Create an array to store 4 integer numbers
        int a[] = new int[4];

        // Scanner object to capture input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers : ");
        
        // Variable to store the total sum of numbers
        float sum = 0;

        // Loop runs 4 times to collect each number
        for (int i = 0; i < 4; i++) {
            // Read an integer from the user and store it in the array
            a[i] = sc.nextInt();
            
            // Add the current number to the running total 'sum'
            sum = sum + a[i];
        }

        // Calculate and print the average (Total Sum / Number of elements)
        System.out.println("Average : " + sum / 4);
        
        sc.close(); // Close scanner to free up resources
    }
}
