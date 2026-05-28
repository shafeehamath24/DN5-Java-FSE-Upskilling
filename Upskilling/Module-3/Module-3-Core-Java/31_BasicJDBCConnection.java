/* 31. Basic JDBC Connection
• Objective: Connect Java with a relational database.
• Task: Connect to a local MySQL/SQLite database and retrieve data.
• Instructions:
o Set up a database with a students table.
o Write code to load the JDBC driver, create a connection, execute a SELECT query, and print results. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class BasicJDBCConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age"));
            }

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}