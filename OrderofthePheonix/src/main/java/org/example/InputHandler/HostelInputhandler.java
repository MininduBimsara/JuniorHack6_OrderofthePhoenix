package org.example.InputHandler;

import java.util.Scanner;

public class HostelInputhandler implements InputHandler{

    public void add(){

        Scanner input = new Scanner(System.in);
        System.out.println("Hostel Management...\n\n");
        System.out.println("[1] Add the name\n\n");
        String hostelname = input.nextLine();
        System.out.println("[2] Enter the number of Rooms\n\n");
        String hostelRooms = input.nextLine();
        System.out.println("[0] Main Menu\n\n");
        String Menu = input.nextLine();

    }

    public void inputUpdateHostal(){



    }
    public void inputViewHostal(){


    }

}
