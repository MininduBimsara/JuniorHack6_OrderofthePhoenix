package org.example.menus;
import java.util.Scanner;

public class HostelManagementMenu {
    public String hostelMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hostel Management...\n\n");
        System.out.println("[1] Add a Hostel\n\n");
        System.out.println("[2] Update Hostel Information\n\n");
        System.out.println("[3] View Hostel Details\n\n");
        System.out.println("[4] Rooms Management\n\n");
        System.out.println("[0] Main Menu\n\n");

        String numberHostel = input.nextLine();

        return numberHostel;
    }
}
