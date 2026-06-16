//write a program to accept 5 num. from the user and reverse them

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers : ");
        int i;
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            System.out.println("You entered : " + a[i]);
        }
        
        System.out.println("Printing in Reverse Order:");
        // Correct logic: Start from 4, go down to 0
        for (i = 4; i >= 0; i--) {
            System.out.println("Reversed : " + a[i]);
        }
        
        sc.close();
    }
}
