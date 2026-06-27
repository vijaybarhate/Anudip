// Import LinkedList and Scanner from java.util
import java.util.*;

// Public class TrainWaitingList — manages a waiting list for train ticket reservations
public class TrainWaitingList {
    // main() method — program execution starts here
    public static void main(String[] args) {

        // Create a LinkedList to act as a FIFO (First-In-First-Out) waiting list
        // Passengers are added to the end and removed from the front when seats open up
        LinkedList<String> waitingList = new LinkedList<String>();

        // Create a Scanner to read user input for interactive menu
        Scanner sc = new Scanner(System.in);

        // Variable to store the user's menu choice
        int choice;

        // do-while loop — shows the menu repeatedly until user chooses to exit
        do {
            // Display the waiting list management menu
            System.out.println("\n===== TRAIN WAITING LIST =====");
            System.out.println("1. Add Passenger to Waiting List");
            System.out.println("2. Allocate Seat (remove first passenger)");
            System.out.println("3. View Waiting List");
            System.out.println("4. Check Waiting List Size");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Read the user's menu choice
            choice = sc.nextInt();
            // Consume the leftover newline character so nextLine() works properly
            sc.nextLine();

            // Execute the action based on the user's choice
            switch (choice) {

                // --- CASE 1: ADD A PASSENGER TO THE WAITING LIST ---
                case 1:
                    // Ask for the passenger's name
                    System.out.print("Enter passenger name: ");
                    String name = sc.nextLine();
                    // addLast() appends the passenger at the end of the queue
                    waitingList.addLast(name);
                    System.out.println(name + " added to waiting list.");
                    break;

                // --- CASE 2: ALLOCATE A SEAT (REMOVE FIRST PASSENGER) ---
                case 2:
                    // Check if the waiting list has any passengers
                    if (waitingList.isEmpty()) {
                        System.out.println("Waiting list is empty. No one to allocate.");
                    } else {
                        // removeFirst() removes and returns the passenger at the front of the queue
                        // This simulates allocating a seat to the person who has been waiting the longest
                        String allocated = waitingList.removeFirst();
                        System.out.println("Seat allocated to: " + allocated);
                    }
                    break;

                // --- CASE 3: VIEW THE ENTIRE WAITING LIST ---
                case 3:
                    // Check if the list is empty before displaying
                    if (waitingList.isEmpty()) {
                        System.out.println("Waiting list is empty.");
                    } else {
                        System.out.println("\nCurrent Waiting List (" + waitingList.size() + " passengers):");
                        // Loop through each passenger with their position number
                        for (int i = 0; i < waitingList.size(); i++) {
                            // get(i) retrieves the element at index i without removing it
                            System.out.println((i + 1) + ". " + waitingList.get(i));
                        }
                    }
                    break;

                // --- CASE 4: CHECK THE SIZE OF THE WAITING LIST ---
                case 4:
                    // size() returns the current number of elements in the LinkedList
                    System.out.println("Total passengers waiting: " + waitingList.size());
                    break;

                // --- CASE 5: EXIT THE PROGRAM ---
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                // --- DEFAULT: HANDLE INVALID INPUT ---
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }

            // Keep showing the menu until the user selects option 5
        } while (choice != 5);

        // Close the Scanner to release the input stream resource
        sc.close();
    } // End of main() method
} // End of TrainWaitingList class
