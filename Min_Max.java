import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        // Create an array to hold 5 integers
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers : ");
        int i;
        
        // Loop 1: Collecting Input
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        
        // Loop 2: Confirmation
        for (i = 0; i < 5; i++) {
            System.out.println("You entered : " + a[i]);
        }

        // --- Logic to find Min and Max ---
        
        // 1. Assume the very first element is BOTH the smallest and largest initially
        int min = a[0];
        int max = a[0];

        // 2. Loop through the rest of the array (starting from index 1)
        for (i = 1; i < 5; i++) {
            // If current element is LARGER than our current max, update max
            if (a[i] > max) {
                max = a[i];
            }
            // If current element is SMALLER than our current min, update min
            if (a[i] < min) {
                min = a[i];
            }
        }

        // 3. Print the final results
        System.out.println("Maximum Element : " + max);
        System.out.println("Minimum Element : " + min);
        
        sc.close();
    }
}
