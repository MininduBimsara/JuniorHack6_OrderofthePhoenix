package org.example.factory;

import org.example.InputHandler.HostelInputhandler;
import org.example.InputHandler.InputHandler;
import org.example.menus.HostelManagementMenu;

public class HostelMenuFactory {

    public InputHandler selectMenuItem (){
        HostelManagementMenu hostelManagementMenu = new HostelManagementMenu();
        int number = hostelManagementMenu.hostelMenu();
        HostelInputhandler hostelInputhandler = new HostelInputhandler();

        if (number == 1) {
            return Inputhandler.add();
        } else if (number == '2') {
            hostelInputhandler.inputUpdateHostal();
        } else if (number == '3') {
            hostelInputhandler.inputViewHostal();
        } else if (number == '4') {
            input
        } else if (number == '0') {

        } else {
            System.out.println("Invalid Input");
        }
    }
}
