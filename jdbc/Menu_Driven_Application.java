import java.sql.*;
import java.util.Scanner;

public class Menu_Driven_Application {

    static final String URL = "jdbc:mysql://localhost:3306/ProductDB";
    static final String USER = "root";
    static final String PASSWORD = "tiger";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;

            do {
                System.out.println("\n----- PRODUCT MENU -----");
                System.out.println("1. Insert Product");
                System.out.println("2. Update Product");
                System.out.println("3. Delete Product");
                System.out.println("4. Display Products");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Product ID: ");
                        int pid = sc.nextInt();

                        sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        String pname = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        String insertQuery = "INSERT INTO ProductInfo VALUES(?,?,?,?)";

                        PreparedStatement ps1 = con.prepareStatement(insertQuery);

                        ps1.setInt(1, pid);
                        ps1.setString(2, pname);
                        ps1.setDouble(3, price);
                        ps1.setInt(4, qty);

                        int i = ps1.executeUpdate();

                        if (i > 0)
                            System.out.println("Product Inserted Successfully");
                        break;

                    case 2:
                        System.out.print("Enter Product ID to Update: ");
                        pid = sc.nextInt();

                        System.out.print("Enter New Price: ");
                        price = sc.nextDouble();

                        System.out.print("Enter New Quantity: ");
                        qty = sc.nextInt();

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

                    case 3:
                        System.out.print("Enter Product ID to Delete: ");
                        pid = sc.nextInt();

                        String deleteQuery = "DELETE FROM ProductInfo WHERE pid=?";

                        PreparedStatement ps3 = con.prepareStatement(deleteQuery);

                        ps3.setInt(1, pid);

                        int d = ps3.executeUpdate();

                        if (d > 0)
                            System.out.println("Product Deleted Successfully");
                        else
                            System.out.println("Product Not Found");
                        break;

                    case 4:
                        String selectQuery = "SELECT * FROM ProductInfo";

                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(selectQuery);

                        System.out.println("\nPID\tPNAME\tPRICE\tQUANTITY");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("pid") + "\t" +
                                            rs.getString("pname") + "\t" +
                                            rs.getDouble("price") + "\t" +
                                            rs.getInt("quantity"));
                        }
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 5);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}