package org.example.Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseIntegration {

    // Connect to the database

    private static final String URL = "jdbc:mysql://localhost:3306/hostalmanagementsystem";
    private static final String User = "root";
    private static final String Password = "";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, User, Password);
            System.out.println("Connected to the database");
        } catch (SQLException e) {

            System.out.println("An error occurred while connecting to the database " + e.getMessage());

        }
        return connection;
    }

}
