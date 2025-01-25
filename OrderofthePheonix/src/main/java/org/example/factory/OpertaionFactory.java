package org.example.factory;

import org.example.Main;
import org.example.Services.MainService;
import org.example.menus.HostelManagementMenu;
import org.example.menus.MainMenu;
import org.example.menus.StudentAllocationManagementMenu;
import org.example.menus.StudentManagementMenu;

public class OpertaionFactory {

    public void selectItemFromMainMenu(int number) {

        if(number == 1) {
            HostelManagementMenu hostelManagementMenu = new HostelManagementMenu();
            int result = hostelManagementMenu.hostelMenu();
            HostelMenuFactory hostelMenuFactory = new HostelMenuFactory();
            hostelMenuFactory.selectMenuItem(result);
        } else if (number == 2) {
            StudentManagementMenu studentManagementMenu = new StudentManagementMenu();
            int result = studentManagementMenu.studentMenu();
            StudentMenuFactory studentMenuFactory = new StudentMenuFactory();
            studentMenuFactory.selectMenuItem(result);
        } else if (number == 3) {
            StudentAllocationManagementMenu studentAllocationManagementMenu = new StudentAllocationManagementMenu();
            int result = studentAllocationManagementMenu.studentAllocationMenu();
            StudentAllocationMenuFactory studentAllocationMenuFactory = new StudentAllocationMenuFactory();
            studentAllocationMenuFactory.selectMenuItem(result);
        } else if(number == 0) {
            return;
        } else {
            System.out.println("Invalid Input");
        }

    }
}
