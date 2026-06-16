// Program to accept 5 numbers from user and print them in reverse order

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        // Create an array with 5 slots
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers : ");
        int i;
        
        // Loop 1: Filling the array (Forward)
        // Indices used: 0, 1, 2, 3, 4
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        
        // Loop 2: Displaying the numbers as entered
        for (i = 0; i < 5; i++) {
            System.out.println("You entered : " + a[i]);
        }
        
        System.out.println("Printing in Reverse Order:");
        
        // Loop 3: Reversing the logic
        // We start at '4' (the last index)
        // We continue as long as 'i' is 0 or greater (i >= 0)
        // We subtract 1 each time (i--) to move backwards
        for (i = 4; i >= 0; i--) {
            // Prints elements in order: a[4], a[3], a[2], a[1], a[0]
            System.out.println("Reversed : " + a[i]);
        }
        
        sc.close();
    }
}
