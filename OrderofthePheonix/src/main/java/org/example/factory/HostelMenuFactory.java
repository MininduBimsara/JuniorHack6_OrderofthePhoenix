package org.example.factory;

import org.example.InputHandler.HostelInputhandler;
import org.example.Main;
import org.example.Services.MainService;
import org.example.menus.MainMenu;

public class HostelMenuFactory {

    public void selectMenuItem(int number) {
        HostelInputhandler hostelInputhandler = new HostelInputhandler();

        if (number == 1) {
            hostelInputhandler.add();
        } else if (number == '2') {
            hostelInputhandler.update();
        } else if (number == '3') {
            hostelInputhandler.view();
        } else if (number == '4') {
            RoomsMenuFactory roomsMenuFactory = new RoomsMenuFactory();
            roomsMenuFactory.selectMenuItem(number);
        } else if (number == '0') {
            MainService mainService = new MainService();
            mainService.mainMenu();
        } else {
            System.out.println("Invalid Input");
        }
    }
}
