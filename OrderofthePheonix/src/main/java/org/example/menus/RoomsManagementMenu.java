package org.example.menus;
import java.util.Scanner;

public class RoomsManagementMenu {
    public int roomsMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Rooms Management...\n\n");
        System.out.println("[1] Add Rooms\n\n");
        System.out.println("[1] View Rooms\n\n");
        System.out.println("[3] update Rooms\n\n");
        System.out.println("[4] Delete Rooms\n\n");
        System.out.println("[0] Back to Previous\n\n");

        int numberRooms = input.nextInt();

        return numberRooms;
    }
}
