package org.example.factory;

import org.example.Services.MainService;
import org.example.menus.HostelManagementMenu;
import org.example.menus.MainMenu;

public class OpertaionFactory {

    public void selectItemFromMainMenu(int number) {

        HostelManagementMenu hostelManagementMenu = new HostelManagementMenu();

        if(number == 1) {
            hostelManagementMenu.hostelMenu();
        }

    }
}
