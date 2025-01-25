package org.example.factory;

import org.example.InputHandler.HostelInputhandler;
import org.example.Services.HostelService;
import org.example.menus.HostelManagementMenu;

public class HostelMenuFactory {

    HostelManagementMenu hostelManagementMenu = new HostelManagementMenu();
    String number = hostelManagementMenu.hostelMenu();
    HostelService hostelService = new HostelService();
    HostelInputhandler hostelInputhandler = new HostelInputhandler();

    if (number == '1') {
    } else if (number == '2') {

    } else if (number == '3') {
        System.out.println("View Hostel Details");
    } else if (number == '4') {
        System.out.println("Rooms Management");
    } else if (number == '0') {
        System.out.println("Main Menu");
    } else {
        System.out.println("Invalid Input");
    }
}
