package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
    public void createDatabase() {
        try {
            // MySQL connection details
            String url = "jdbc:mysql://localhost:3306";
            String userName = "root"; // Replace with your MySQL username
            String password = "yourpassword"; // Replace with your MySQL password

            // Create connection
            Connection conn = DriverManager.getConnection(url, userName, password);

            // Create statement
            Statement st = conn.createStatement();

            // SQL query to create a database
            String query = "CREATE DATABASE IF NOT EXISTS student";

            // Execute query
            st.executeUpdate(query);

            System.out.println("\nDatabase has been created successfully");

            // Close the connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void createTable() {
        try {
            // MySQL connection details
            String url = "jdbc:mysql://localhost:3306/student";
            String userName = "root";
            String password = "Bk2k5@#$";

            // Create connection
            Connection conn = DriverManager.getConnection(url, userName, password);

            // Create statement
            Statement st = conn.createStatement();

            // SQL query to create a table
            String query = "\nCREATE TABLE IF NOT EXISTS students(s_id INT PRIMARY KEY, s_name VARCHAR(50), s_email VARCHAR(50))";

            // Execute query
            st.executeUpdate(query);

            System.out.println("\nTable has been created successfully.");
            
            // Close the connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void insertData(int id, String name, String email){
        try{
            //My SQL Connection Details
            String url = "jdbc:mysql://localhost:3306/student";
            String userName = "root";
            String password = "Bk2k5@#$";
    
            // Create connection
            Connection conn = DriverManager.getConnection(url, userName, password);
    
            // SQL query to insert data into the table
            String query = "INSERT INTO students(s_id, s_name, s_email) VALUES (?, ?, ?)";
    
            // Create prepared statement
            PreparedStatement pstm = conn.prepareStatement(query);
    
            // Set the values for the placeholders
            pstm.setInt(1, id);
            pstm.setString(2, name);
            pstm.setString(3, email);
    
            // Execute query
            pstm.executeUpdate(); // Use executeUpdate() on PreparedStatement, not the query string
    
            System.out.println("\nData has been inserted successfully.\n");
    
            // Close the connection
            conn.close();
    
        }catch( Exception e){
            e.printStackTrace();
        }
    }
    

    public void readData(){
        try {
            // MySQL connection details
            String url = "jdbc:mysql://localhost:3306/student";
            String userName = "root";
            String password = "Bk2k5@#$";
    
            // Create connection
            Connection conn = DriverManager.getConnection(url, userName, password);
    
            // SQL query to select data from the table
            String query = "SELECT * FROM students";
    
            // Create statement
            Statement st = conn.createStatement();
    
            // Execute query
            ResultSet rs = st.executeQuery(query); // Use executeQuery() to retrieve data
    
            // Process the result set
            while (rs.next()) {
                // Assuming columns are id (int), name (String), email (String)
                System.out.println("\nID: " + rs.getInt("s_id"));
                System.out.println("Name: " + rs.getString("s_name"));
                System.out.println("Email: " + rs.getString("s_email") + "\n");
            }
            System.out.println("\nData read successfully.");
    
            // Close the connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void updateData(int id, String newName, String newEmail) {
        try {
            // MySQL connection details
            String url = "jdbc:mysql://localhost:3306/student";
            String userName = "root";
            String password = "Bk2k5@#$";
    
            // Create connection
            Connection conn = DriverManager.getConnection(url, userName, password);
    
            // SQL query to update data
            String query = "UPDATE students SET s_name = ?, s_email = ? WHERE s_id = ?";
    
            // Create prepared statement
            PreparedStatement pstm = conn.prepareStatement(query);
    
            // Set the values for the placeholders
            pstm.setString(1, newName);
            pstm.setString(2, newEmail);
            pstm.setInt(3, id);
    
            // Execute update
            pstm.executeUpdate();
    
            System.out.println("\nData has been updated successfully.");
    
            // Close the connection
            conn.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void deleteData(int id){
        try {
            // MySQL connection details
            String url = "jdbc:mysql://localhost:3306/student";
            String userName = "root";
            String password = "Bk2k5@#$";

            // Create connection
            Connection conn = DriverManager.getConnection(url, userName, password);

            // SQL query to delete data
            String query = "DELETE FROM students WHERE s_id = ?";

            // Create prepared statement
            PreparedStatement pstm = conn.prepareStatement(query);

            // Set the value for the placeholder
            pstm.setInt(1, id);

            // Execute update
            pstm.executeUpdate();

            System.out.println("\nData has been deleted successfully.");

            // Close the connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}