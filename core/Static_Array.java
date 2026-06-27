// Public class Static_Array — shows how to create and iterate over a fixed-size array
public class Static_Array {

    // main() method — the entry point of the program
    public static void main(String[] args) {
        // Declare and initialize an integer array in one step using hard-coded values
        // The size is determined automatically from the number of elements (5)
        // Index mapping: arr[0]=56, arr[1]=87, arr[2]=45, arr[3]=76, arr[4]=87
        int arr[] = { 56, 87, 45, 76, 87 };

        // Print a descriptive heading before the array elements
        System.out.println("Array Elements are :");

        // Use 'arr.length' to determine the array size at runtime (avoids hard-coding 5)
        // Loop runs from i = 0 up to i < arr.length (i.e., 0 to 4)
        for (int i = 0; i < arr.length; i++) {
            // Print the element stored at the current index 'i' followed by a newline
            System.out.println(arr[i]);
        }
    }
}
