//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class database_connection {
//    public static void main(String[] args) {
//        // JDBC URL, username and password of MySQL server
//        String url = "jdbc:mysql://localhost:3306/employee";
//        String user = "root";
//        String password = "NULL";
//
//       try(Connection connection  = DriverManager.getConnection(url,user,password)){
//           System.out.println("connection successfully");
//       }
//       catch (Exception e){
//           System.err.println("connection fail "+e.getMessage());
//       }
//    }
//}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class database_connection {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/employee"; // Database name
        String user = "root";
        String password = "NULL";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");

            // Create statement
            Statement stmt = connection.createStatement();

            // Correct table name used here
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee_d");

            // Get number of columns
            int columnCount = rs.getMetaData().getColumnCount();

            // Print column names
            for (int i = 1; i <= columnCount; i++) {
                System.out.print("|"+rs.getMetaData().getColumnName(i) + "|\t");
            }
            System.out.println();

            // Print all data rows
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t\t\t\t\t\t");
                }
                System.out.println();
            }

            // Close resources
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
