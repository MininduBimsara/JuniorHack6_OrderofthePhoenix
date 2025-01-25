package org.example.menus;

import org.example.Services.MainService;

import java.util.Scanner;

public class MainMenu {

    public int mainMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("\n---------Welcome to the Hostel Management System---------");
        System.out.println("---------ABC University---------\n");
        System.out.println("Please enter the number of the action you want to proceed\n");
        System.out.println("[1] Manage Hostels");
        System.out.println("[2] Manage Students");
        System.out.println("[3] Manage Student Allocations");
        System.out.println("[0] Exit");

        int number = input.nextInt();

        return number;
    }
}
