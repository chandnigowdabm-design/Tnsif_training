package org.tnsif.acc.c2tc.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PostgreSQLInsertion {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/your_database";
        String username = "postgres";
        String password = "your_password";

        String query = "INSERT INTO student(id, name, age) VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Chandini");
            ps.setInt(3, 20);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Data inserted successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}