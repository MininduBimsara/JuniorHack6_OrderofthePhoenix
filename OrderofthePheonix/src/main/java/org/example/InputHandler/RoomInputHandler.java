package org.example.InputHandler;

import org.example.Services.HostelService;
import org.example.Utils.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RoomInputHandler implements InputHandler{

    Connection conn = DatabaseIntegration.getConnection();

    @Override
    public void add() {

        Scanner input = new Scanner(System.in);
        System.out.println("Rooms Management...\n\n");
        System.out.println("[1] Add the ID (ex: abc001)\n\n");
        String roomId = input.nextLine();
        System.out.println("[2] Add the Room Number\n\n");
        String roomNumber = input.nextLine();
        System.out.println("[3] Add the Hostel Number\n\n");
        String hostelNumber = input.nextLine();
        System.out.println("[4] Enter the Capacity of the Room\n\n");
        String roomsCapacity= input.nextLine();
//        System.out.println("[5] Enter the AvailableCapacity of the Room\n\n");
//        String availableRoomCapacity = input.nextLine();
        System.out.println("[0] Back to Previous\n\n");
        String Menu = input.nextLine();

        HostelService hostelService = new HostelService();
        hostelService.addHostel(roomId,hostelName,parseInt(availableRoomCapacity),conn);
    }

    @Override
    public void update() {

    }

    @Override
    public void view() {

    }

    @Override
    public void delete() {

    }
}
