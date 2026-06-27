// Import LinkedList and other utility classes from java.util
import java.util.*;

// Public class BrowserHistory — simulates browser back/forward navigation using LinkedList
public class BrowserHistory {
    // main() method — the entry point where JVM begins execution
    public static void main(String[] args) {

        // Create a LinkedList to store the browsing history as a stack-like structure
        // New pages are added at the end; going back removes the last page
        LinkedList<String> history = new LinkedList<String>();

        // --- SIMULATE VISITING PAGES ---

        // User visits google.com — it gets appended to the end of the history list
        history.add("google.com");
        // User then navigates to youtube.com
        history.add("youtube.com");
        // User visits gmail.com
        history.add("gmail.com");
        // User visits github.com — this is now the most recent page
        history.add("github.com");

        // Display the full browsing history in order from oldest to newest
        System.out.println("Browser History: " + history);

        // --- GO BACK TO PREVIOUS PAGE ---

        // removeLast() removes the most recently added page (github.com)
        // This simulates clicking the browser's "Back" button
        history.removeLast();
        System.out.println("After clicking back: " + history);

        // --- VISIT A NEW PAGE ---

        // User visits a new site — it gets added to the end of the list
        history.add("stackoverflow.com");
        System.out.println("After visiting new page: " + history);

        // --- DEMONSTRATE ADDITIONAL NAVIGATION ---

        // Go back again — removes stackoverflow.com (the current page)
        history.removeLast();
        System.out.println("After clicking back again: " + history);

        // Visit another new page — adds to the end
        history.add("reddit.com");
        System.out.println("After visiting reddit.com: " + history);

        // Display the current (most recent) page without removing it
        // getLast() retrieves the last element of the LinkedList
        System.out.println("Current page: " + history.getLast());
    } // End of main() method
} // End of BrowserHistory class
