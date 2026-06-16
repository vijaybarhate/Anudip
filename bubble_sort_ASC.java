public class bubble_sort_ASC {
    public static void main(String[] args) {
        int a[] = {50, 20, 30, 10, 40};
        
        int i, j, temp;

        // Correct Bubble Sort implementation
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap elements
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
