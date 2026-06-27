// Import the java.util package to get access to Scanner and ArrayList
import java.util.*;

// Public class ShoppingCart — simulates a simple shopping cart application
public class ShoppingCart {
    // main() method — program execution begins here
    public static void main(String[] args) {
        // Create a Scanner object tied to System.in to read keyboard input
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList to store product names (strings) that the user adds
        ArrayList<String> cart = new ArrayList<>();

        // Variable to hold the user's menu choice
        int choice;

        // do-while loop: show the menu at least once, repeat until user picks 4 (Checkout)
        do {
            // Display the shopping cart menu options
            System.out.println("\n===== SHOPPING CART =====");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout & Exit");
            System.out.print("Enter your choice: ");

            // Read the integer choice typed by the user
            choice = sc.nextInt();
            // Consume the leftover newline character so nextLine() works properly later
            sc.nextLine();

            // Execute the appropriate action based on the user's choice
            switch (choice) {

                // --- CASE 1: ADD a product to the cart ---
                case 1:
                    // Prompt the user to enter a product name
                    System.out.print("Enter product name to add: ");
                    // Read the full product name (may contain spaces)
                    String product = sc.nextLine();
                    // Append the product to the end of the ArrayList
                    cart.add(product);
                    // Confirm to the user that the product was added
                    System.out.println(product + " added to cart.");
                    break; // Exit the switch block

                // --- CASE 2: REMOVE a product from the cart ---
                case 2:
                    // Ask which product the user wants to remove
                    System.out.print("Enter product name to remove: ");
                    String removeItem = sc.nextLine();
                    // remove() searches the ArrayList, removes the first match, and returns true if found
                    if (cart.remove(removeItem)) {
                        System.out.println(removeItem + " removed from cart.");
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                    break;

                // --- CASE 3: VIEW all products currently in the cart ---
                case 3:
                    // Check if the cart is empty before displaying
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        System.out.println("\nItems in your cart:");
                        // Loop through each element and show its position (1-based) and name
                        for (int i = 0; i < cart.size(); i++) {
                            // i+1 gives a human-friendly index; cart.get(i) retrieves the element
                            System.out.println((i + 1) + ". " + cart.get(i));
                        }
                    }
                    break;

                // --- CASE 4: CHECKOUT and exit ---
                case 4:
                    // If the cart has items, display them as purchased, then clear the cart
                    if (!cart.isEmpty()) {
                        System.out.println("\nPurchased items:");
                        // for-each loop to print every product in the cart
                        for (String item : cart) {
                            System.out.println("- " + item);
                        }
                        // Clear the ArrayList to simulate emptying the cart after purchase
                        cart.clear();
                        System.out.println("Thank you for shopping!");
                    } else {
                        System.out.println("Your cart is empty. Nothing to checkout.");
                    }
                    break;

                // --- DEFAULT: handle invalid menu choices ---
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Keep looping as long as the user hasn't chosen option 4
        } while (choice != 4);

        // Close the Scanner to release the underlying input stream resource
        sc.close();
    }
}
