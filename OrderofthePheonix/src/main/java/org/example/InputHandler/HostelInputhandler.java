package org.example.InputHandler;

import org.example.Services.HostelService;
import org.example.Utils.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HostelInputhandler implements InputHandler{

    public void add(){

        Connection conn = DatabaseIntegration.getConnection();
        Scanner input = new Scanner(System.in);
        System.out.println("Hostel Management...\n\n");
        System.out.println("[1] Add the ID (ex: abc001)\n\n");
        String hostelId = input.nextLine();
        System.out.println("[2] Add the name\n\n");
        String hostelName = input.nextLine();
        System.out.println("[3] Enter the number of Rooms\n\n");
        String hostelRooms = input.nextLine();
        System.out.println("[0] Main Menu\n\n");
        String Menu = input.nextLine();

        HostelService hostelService = new HostelService();
        hostelService.addHostel(hostelId,hostelName,parseInt(hostelRooms),conn);
    }

    public void inputUpdateHostal(){



    }
    public void inputViewHostal(){


    }

}
