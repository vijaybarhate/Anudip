import java.util.Scanner;

public class Min_Max {
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

        // Initialize min and max with the first element
        int min = a[0];
        int max = a[0];

        // Loop through the array to find min and max
        for (i = 1; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Maximum Element : " + max);
        System.out.println("Minimum Element : " + min);
        
        sc.close();
    }
}
