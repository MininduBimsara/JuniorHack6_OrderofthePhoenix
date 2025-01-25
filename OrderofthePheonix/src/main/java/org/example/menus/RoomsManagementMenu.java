package org.example.menus;
import java.util.Scanner;

public class RoomsManagementMenu {
    public int roomsMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Rooms Management...\n");
        System.out.println("[1] Add Rooms");
        System.out.println("[1] View Rooms");
        System.out.println("[3] update Rooms");
        System.out.println("[4] Delete Rooms");
        System.out.println("[0] Back to Previous");

        int numberRooms = input.nextInt();

        return numberRooms;
    }
}
