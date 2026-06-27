// Public class named bubble_sort_ASC that implements the Bubble Sort algorithm in ascending order
public class bubble_sort_ASC {
    // main() method — execution starts here
    public static void main(String[] args) {
        // Declare and initialize an integer array with 5 unsorted values
        int a[] = {50, 20, 30, 10, 40};

        // Declare loop counters (i, j) and a temporary variable (temp) used during swapping
        int i, j, temp;

        // Outer loop — runs for (n-1) passes, where n = array length
        // After each pass, the largest unsorted element "bubbles up" to its correct position
        for (i = 0; i < a.length - 1; i++) {
            // Inner loop — compares adjacent elements
            // We subtract 'i' because the last 'i' elements are already sorted
            for (j = 0; j < a.length - 1 - i; j++) {
                // If the current element is GREATER than the next one, swap them
                if (a[j] > a[j + 1]) {
                    // Store a[j] in temp so we don't lose its value
                    temp = a[j];
                    // Move the smaller value (a[j+1]) to the left position
                    a[j] = a[j + 1];
                    // Put the larger value (temp) into the right position
                    a[j + 1] = temp;
                }
            }
        }

        // Print a heading for the sorted output
        System.out.println("Sorted Array:");
        // Loop through the entire sorted array from index 0 to length-1
        for (int k = 0; k < a.length; k++) {
            // Print each element followed by a space (print, not println — stays on same line)
            System.out.print(a[k] + " ");
        }
    }
}
