package org.example.InputHandler;

import org.example.Services.HostelService;
import org.example.Utils.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HostelInputhandler implements InputHandler{

    Connection conn = DatabaseIntegration.getConnection();
    public void add(){


        Scanner input = new Scanner(System.in);
        System.out.println("Hostel Management...\n\n");
        System.out.println("[1] Add the ID (ex: abc001)\n\n");
        String hostelId = input.nextLine();
        System.out.println("[2] Add the name\n\n");
        String hostelName = input.nextLine();
        System.out.println("[3] Enter the number of Rooms\n\n");
        String hostelRooms = input.nextLine();
        System.out.println("[0] Back to Previous\n\n");
        String Menu = input.nextLine();

        HostelService hostelService = new HostelService();
        hostelService.addHostel(hostelId,hostelName,parseInt(hostelRooms),conn);
    }

    @Override
    public void update() {


        Scanner input = new Scanner(System.in);
        System.out.println("Select What you want to Upgrade...\n\n");
        System.out.println("[1] Add the ID (ex: abc001)\n\n");
        String hostelId = input.nextLine();
        System.out.println("[2] Add the name\n\n");
        String hostelName = input.nextLine();
        System.out.println("[3] Enter the number of Rooms\n\n");
        String hostelRooms = input.nextLine();
        System.out.println("[0] Back to Previous\n\n");
        String Menu = input.nextLine();

        HostelService hostelService = new HostelService();
        hostelService.addHostel(hostelId,hostelName,parseInt(hostelRooms),conn);
    }

    @Override
    public void view(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please Give me the ID of the Hostel...\n\n");
        String hostelId = input.nextLine();
        HostelService hostelService = new HostelService();
        hostelService.getHostel(hostelId,conn);
    }

    @Override
    public void remove() {

    }

}
