package org.example.InputHandler;

import org.example.Services.HostelService;
import org.example.Services.RoomService;
import org.example.Services.StudentService;
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
        System.out.println("[2] Add the Hostel Number\n\n");
        String hostelId = input.nextLine();
        System.out.println("[3] Add the Room Number\n\n");
        String roomNumber = input.nextLine();
        System.out.println("[4] Enter the Capacity of the Room\n\n");
        String roomsCapacity= input.nextLine();
        System.out.println("[0] Back to Previous\n\n");
        String Menu = input.nextLine();

        RoomService roomService = new RoomService();
        roomService.addRoom(roomId,hostelId,parseInt(roomNumber),parseInt(roomsCapacity),conn);
    }

    @Override
    public void update() {

        Scanner input = new Scanner(System.in);
        System.out.println("Rooms Management...\n\n");
        System.out.println("[1] Add the ID (ex: abc001)\n\n");
        String roomId = input.nextLine();
        System.out.println("[2] Add the Hostel Number\n\n");
        String hostelId = input.nextLine();
        System.out.println("[3] Add the Room Number\n\n");
        String roomNumber = input.nextLine();
        System.out.println("[4] Enter the Capacity of the Room\n\n");
        String roomsCapacity= input.nextLine();
        System.out.println("[4] Enter the Available Capacity of the Room\n\n");
        String roomsAvailableCapacity= input.nextLine();
        System.out.println("[0] Back to Previous\n\n");
        String Menu = input.nextLine();

        RoomService roomService = new RoomService();
        roomService.updateRoom(roomId,hostelId,parseInt(roomNumber),parseInt(roomsCapacity),parseInt(roomsAvailableCapacity),conn);

    }

    @Override
    public void view() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Give me the Room number...\n\n");
        String roomNum = input.nextLine();
        RoomService roomService = new RoomService();
        roomService.viewRoom(roomNum,conn);
    }

    @Override
    public void remove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Give me the Room number...\n\n");
        String roomNum = input.nextLine();

        RoomService roomService = new RoomService();
        roomService.deleteRoom(roomNum,conn);
    }


}
