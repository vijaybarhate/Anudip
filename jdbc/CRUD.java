import java.sql.*;
import java.util.Scanner;

public class CRUD {
    // Database credentials and connection URL
    static final String url = "jdbc:mysql://localhost:3306/company";
    static final String uname = "root";
    static final String pass = "root";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // Display User Menu
            System.out.println("\n1. Add Employee");
            System.out.println("2. View All Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            // Check if input is a valid integer to avoid crashes
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input
                continue;
            }
            
            int ch = sc.nextInt();

            try {
                // Execute action based on user choice
                switch (ch) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        viewEmployee();
                        break;
                    case 3:
                        updateEmployee();
                        break;
                    case 4:
                        deleteEmployee();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0); // Safely terminate the program
                    default:
                        System.out.println("Invalid Input!");
                }
            } catch (SQLException e) {
                // Catch any database related errors (e.g., wrong password, table missing)
                System.err.println("Database error: " + e.getMessage());
            }
        }
    }

    // Helper method to establish a connection to the database
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, uname, pass);
    }

    // DELETE: Remove an employee record by their ID (eid)
    private static void deleteEmployee() throws SQLException {
        System.out.print("Enter the id of employee to delete: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM Employee WHERE eid = ?";
        
        // try-with-resources ensures the Connection and PreparedStatement close automatically
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id); // Bind the ID to the '?' placeholder
            int rows = ps.executeUpdate(); // Run the delete command
            System.out.println(rows > 0 ? "Data deleted!" : "Record not found!");
        }
    }

    // UPDATE: Modify existing employee details
    private static void updateEmployee() throws SQLException {
        System.out.print("Enter the employee id to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline character
        
        System.out.print("Enter updated name: ");
        String name = sc.nextLine();
        System.out.print("Enter updated department: ");
        String dept = sc.nextLine();
        System.out.print("Enter updated salary: ");
        double sal = sc.nextDouble();
        
        String sql = "UPDATE Employee SET name = ?, dept = ?, sal = ? WHERE eid = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            // Set values for each '?' in order
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, sal);
            ps.setInt(4, id);
            
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Data Updated!" : "Record not found!");
        }
    }

    // READ: Retrieve and display all records from the table
    private static void viewEmployee() throws SQLException {
        String query = "SELECT * FROM Employee";
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) { // 'rs' contains the table data
            
            boolean found = false;
            while (rs.next()) { // Iterate through each row in the result set
                found = true;
                // Fetch values from columns by their names
                System.out.printf("ID: %d | Name: %s | Dept: %s | Salary: %.2f%n",
                        rs.getInt("eid"), rs.getString("name"), 
                        rs.getString("dept"), rs.getDouble("sal"));
            }
            if (!found) System.out.println("No records found.");
        }
    }

    // CREATE: Insert a new employee into the database
    private static void addEmployee() throws SQLException {
        sc.nextLine(); // Clear scanner buffer
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();
        
        String sql = "INSERT INTO Employee(name, dept, sal) VALUES(?,?,?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, sal);
            
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Data added!" : "Failed to add data.");
        }
    }
}
