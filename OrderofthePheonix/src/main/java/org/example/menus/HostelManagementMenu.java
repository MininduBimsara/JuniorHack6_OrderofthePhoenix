package org.example.menus;
import java.util.Scanner;

public class HostelManagementMenu {
    public int hostelMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hostel Management...\n");
        System.out.println("[1] Add a Hostel");
        System.out.println("[2] Update Hostel Information");
        System.out.println("[3] View Hostel Details");
        System.out.println("[4] Rooms Management");
        System.out.println("[0] Main Menu");

        int numberHostel = input.nextInt();

        return numberHostel;
    }
}
