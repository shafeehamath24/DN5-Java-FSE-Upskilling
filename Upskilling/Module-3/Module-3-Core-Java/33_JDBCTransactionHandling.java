/* 33. Transaction Handling in JDBC
• Objective: Use JDBC transactions.
• Task: Simulate a money transfer between two accounts.
• Instructions:
o Create accounts table with balances.
o Implement a transfer method with Connection.setAutoCommit(false).
o Commit if both debit and credit succeed, else rollback. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class JDBCTransactionHandling {

    static String url = "jdbc:mysql://localhost:3306/bankdb";
    static String username = "root";
    static String password = "root";

    static void transferMoney(int fromId, int toId, double amount) {

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            con.setAutoCommit(false);

            String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE id = ?";

            String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            PreparedStatement debit = con.prepareStatement(debitQuery);
            PreparedStatement credit = con.prepareStatement(creditQuery);

            debit.setDouble(1, amount);
            debit.setInt(2, fromId);

            credit.setDouble(1, amount);
            credit.setInt(2, toId);

            debit.executeUpdate();
            credit.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful.");

            con.close();

        } catch (Exception e) {

            System.out.println("Transaction Failed.");

            e.printStackTrace();

        }
    }

    public static void main(String[] args) {

        transferMoney(1, 2, 500);

    }
}