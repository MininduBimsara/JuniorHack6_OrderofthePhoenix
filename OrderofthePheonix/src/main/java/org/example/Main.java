package org.example;

import org.example.Services.MainService;
import org.example.Utils.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Connect to the database

        Connection conn = DatabaseIntegration.getConnection();

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------Welcome to the Hostel Management System---------\n\n");
        System.out.println("\n\n---------ABC University---------\n\n");
        System.out.println("Please enter the number of the action you want to proceed\n\n");
        System.out.println("[1] Manage Hostels\n\n");
        System.out.println("[2] Manage Students\n\n");
        System.out.println("[3] Manage Student Allocations\n\n");
        System.out.println("[0] Exit\n\n");
        String name = input.nextLine();


        // Add an employee to the database
        MainService mainService = new MainService();
    }
}