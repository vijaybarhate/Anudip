// Import JDBC classes for database connectivity (Connection, PreparedStatement, etc.)
import java.sql.*;
// Import Scanner to read user input from the keyboard
import java.util.Scanner;

public class Menu_Driven_Application {

    // Database connection details — change these to match your MySQL setup
    static final String URL = "jdbc:mysql://localhost:3306/ProductDB";
    static final String USER = "root";
    static final String PASSWORD = "tiger";

    public static void main(String[] args) {

        // Scanner object to capture what the user types in the console
        Scanner sc = new Scanner(System.in);

        try {
            // Load the MySQL JDBC driver class so Java knows how to talk to MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a live connection to the database using the credentials above
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;

            // Keep showing the menu until the user picks option 5 (Exit)
            do {
                System.out.println("\n----- PRODUCT MENU -----");
                System.out.println("1. Insert Product");
                System.out.println("2. Update Product");
                System.out.println("3. Delete Product");
                System.out.println("4. Display Products");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");

                // Read the user's menu choice as an integer
                choice = sc.nextInt();

                // Decide which operation to perform based on the choice
                switch (choice) {

                    case 1: // --- INSERT a new product ---
                        System.out.print("Enter Product ID: ");
                        int pid = sc.nextInt();

                        sc.nextLine(); // Consume leftover newline from nextInt()
                        System.out.print("Enter Product Name: ");
                        String pname = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        // SQL query with ? placeholders for safe parameter injection
                        String insertQuery = "INSERT INTO ProductInfo VALUES(?,?,?,?)";

                        // Prepare the statement — the DB compiles the SQL with placeholders
                        PreparedStatement ps1 = con.prepareStatement(insertQuery);

                        // Fill each ? placeholder with actual values (1-indexed)
                        ps1.setInt(1, pid);
                        ps1.setString(2, pname);
                        ps1.setDouble(3, price);
                        ps1.setInt(4, qty);

                        // Execute the INSERT & get back how many rows were affected
                        int i = ps1.executeUpdate();

                        if (i > 0)
                            System.out.println("Product Inserted Successfully");
                        break;

                    case 2: // --- UPDATE an existing product's price & quantity ---
                        System.out.print("Enter Product ID to Update: ");
                        pid = sc.nextInt();

                        System.out.print("Enter New Price: ");
                        price = sc.nextDouble();

                        System.out.print("Enter New Quantity: ");
                        qty = sc.nextInt();

                        // Update only the price and quantity columns for the matching product
                        String updateQuery = "UPDATE ProductInfo SET price=?, quantity=? WHERE pid=?";

                        PreparedStatement ps2 = con.prepareStatement(updateQuery);

                        ps2.setDouble(1, price);
                        ps2.setInt(2, qty);
                        ps2.setInt(3, pid);

                        int u = ps2.executeUpdate();

                        if (u > 0)
                            System.out.println("Product Updated Successfully");
                        else
                            System.out.println("Product Not Found");
                        break;

                    case 3: // --- DELETE a product by its ID ---
                        System.out.print("Enter Product ID to Delete: ");
                        pid = sc.nextInt();

                        // Delete the row where pid matches the given ID
                        String deleteQuery = "DELETE FROM ProductInfo WHERE pid=?";

                        PreparedStatement ps3 = con.prepareStatement(deleteQuery);

                        ps3.setInt(1, pid);

                        int d = ps3.executeUpdate();

                        if (d > 0)
                            System.out.println("Product Deleted Successfully");
                        else
                            System.out.println("Product Not Found");
                        break;

                    case 4: // --- DISPLAY all products in the table ---
                        // Select every row from the ProductInfo table
                        String selectQuery = "SELECT * FROM ProductInfo";

                        // Statement is used for simple SQL queries without parameters
                        Statement st = con.createStatement();
                        // executeQuery returns a ResultSet containing all matching rows
                        ResultSet rs = st.executeQuery(selectQuery);

                        System.out.println("\nPID\tPNAME\tPRICE\tQUANTITY");

                        // Loop through each row returned by the query
                        while (rs.next()) {
                            // Extract values from the current row by column name
                            System.out.println(
                                    rs.getInt("pid") + "\t" +
                                            rs.getString("pname") + "\t" +
                                            rs.getDouble("price") + "\t" +
                                            rs.getInt("quantity"));
                        }
                        break;

                    case 5: // --- EXIT the program ---
                        System.out.println("Exiting...");
                        break;

                    default: // Handle invalid menu choices
                        System.out.println("Invalid Choice");
                }

            } while (choice != 5); // Repeat until user chooses 5

            con.close(); // Close the database connection to free resources

        } catch (Exception e) {
            // Catch any error (e.g., connection failure, missing driver, wrong SQL)
            System.out.println(e);
        } finally {
            // Ensure the Scanner is always closed to prevent resource leak
            if (sc != null) {
                sc.close();
            }
        }
    }
}