// Import java.util to access Scanner (for input) and ArrayList (dynamic collection)
import java.util.*;

// Public class PlaylistManager — manages a music playlist with add/remove/view capabilities
public class PlaylistManager {
    // main() method — the JVM calls this when the program starts
    public static void main(String[] args) {
        // Create a Scanner to read user input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Create an empty ArrayList to hold song names as Strings
        ArrayList<String> playlist = new ArrayList<>();

        // Variable to store the menu option chosen by the user
        int choice;

        // do-while loop guarantees the menu is displayed at least once
        do {
            // Print the playlist menu header and options
            System.out.println("\n===== MUSIC PLAYLIST =====");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. View Playlist");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Read the user's numeric choice
            choice = sc.nextInt();
            // Consume the newline character so that nextLine() works correctly later
            sc.nextLine();

            // Branch execution based on the chosen menu option
            switch (choice) {

                // --- CASE 1: ADD a new song to the playlist ---
                case 1:
                    // Ask the user for the song name
                    System.out.print("Enter song name to add: ");
                    // Read the song name (nextLine() captures the full line including spaces)
                    String song = sc.nextLine();
                    // Append the song to the end of the playlist ArrayList
                    playlist.add(song);
                    // Confirm the addition using double quotes around the song name
                    System.out.println("\"" + song + "\" added to playlist.");
                    break;

                // --- CASE 2: REMOVE a song from the playlist ---
                case 2:
                    // First check if the playlist is empty — nothing to remove
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Nothing to remove.");
                        break; // Exit the switch early
                    }
                    // Ask which song to remove
                    System.out.print("Enter song name to remove: ");
                    String removeSong = sc.nextLine();
                    // remove(Object) searches for the first occurrence, deletes it, and returns true
                    if (playlist.remove(removeSong)) {
                        System.out.println("\"" + removeSong + "\" removed from playlist.");
                    } else {
                        System.out.println("Song not found in playlist.");
                    }
                    break;

                // --- CASE 3: VIEW the entire playlist ---
                case 3:
                    // Display a different message depending on whether the playlist has songs
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Add some songs!");
                    } else {
                        // Show the total count and list each song with a track number
                        System.out.println("\nYour Playlist (" + playlist.size() + " songs):");
                        // Loop from index 0 to size()-1, printing each song
                        for (int i = 0; i < playlist.size(); i++) {
                            // i+1 gives a human-readable 1-based track number
                            System.out.println((i + 1) + ". " + playlist.get(i));
                        }
                    }
                    break;

                // --- CASE 4: EXIT the program ---
                case 4:
                    System.out.println("Goodbye! Enjoy your music.");
                    break;

                // --- DEFAULT: handle any invalid menu selection ---
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }

            // Continue looping until the user explicitly selects option 4
        } while (choice != 4);

        // Release the Scanner resource to prevent resource leaks
        sc.close();
    }
}
