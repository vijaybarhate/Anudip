
public class Static_Array {

    public static void main(String[] args) {
        // Directly initialize the array with fixed values (Hard-coding)
        // Indices are 0 (56), 1 (87), 2 (45), 3 (76), 4 (87)
        int arr[] = { 56, 87, 45, 76, 87 };

        System.out.println("Array Elements are :");

        // Use 'arr.length' to automatically know the size of the array
        // Loop starts at index 0 and ends before the length (which is 5)
        for (int i = 0; i < arr.length; i++) {
            // Print the element at the current position 'i'
            System.out.println(arr[i]);
        }
    }
}
