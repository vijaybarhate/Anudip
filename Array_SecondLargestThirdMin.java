import java.util.*;

public class Array_SecondLargestThirdMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

        // Second largest = arr[n-2]
        System.out.println("Second largest element: " + arr[n - 2]);

        // Third minimum = arr[2] (0-indexed)
        System.out.println("Third minimum element: " + arr[2]);

        sc.close();
    }
}
