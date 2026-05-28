/* 32. Insert and Update Operations in JDBC
• Objective: Perform insert/update SQL queries from Java.
• Task: Add and modify student data using JDBC.
• Instructions:
o Create a StudentDAO class.
o Implement methods to insert new records and update student details.
o Use PreparedStatement for parameterized queries. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class JDBCInsertUpdate {

    static String url = "jdbc:mysql://localhost:3306/studentdb";
    static String username = "root";
    static String password = "root";

    static void insertStudent(int id, String name, int age) {

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO students VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();

            System.out.println("Student inserted successfully.");

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    static void updateStudent(int id, String newName) {

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "UPDATE students SET name = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, newName);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student updated successfully.");

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    public static void main(String[] args) {

        insertStudent(1, "Shafee", 20);

        updateStudent(1, "Hamath");
    }
}