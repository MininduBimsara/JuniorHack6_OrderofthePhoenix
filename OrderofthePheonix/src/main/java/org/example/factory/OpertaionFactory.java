package org.example.factory;

import org.example.Main;
import org.example.Services.MainService;
import org.example.menus.HostelManagementMenu;
import org.example.menus.MainMenu;
import org.example.menus.StudentAllocationManagementMenu;
import org.example.menus.StudentManagementMenu;

public class OpertaionFactory {

    public void selectItemFromMainMenu(int number) {

        HostelManagementMenu hostelManagementMenu = new HostelManagementMenu();

        if(number == 1) {
            HostelMenuFactory hostelMenuFactory = new HostelMenuFactory();
            hostelMenuFactory.selectMenuItem(number);
        } else if (number == 2) {

        } else if (number == 3) {

        } else if(number == 0) {
            return;
        } else {
            System.out.println("Invalid Input");
        }

    }
}
