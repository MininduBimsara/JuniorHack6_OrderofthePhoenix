package org.example.factory;

import org.example.Services.MainService;
import org.example.menus.HostelManagementMenu;
import org.example.menus.MainMenu;
import org.example.menus.StudentAllocationManagementMenu;
import org.example.menus.StudentManagementMenu;

public class OpertaionFactory {

    public void selectItemFromMainMenu(int number) {

        HostelManagementMenu hostelManagementMenu = new HostelManagementMenu();
        StudentManagementMenu studentManagementMenu = new StudentManagementMenu();
        StudentAllocationManagementMenu studentAllocationManagementMenu = new StudentAllocationManagementMenu();

        if(number == 1) {
            hostelManagementMenu.hostelMenu();
        } else if (number == 2) {
            studentManagementMenu.studentMenu();
        } else if (number == 3) {
            studentAllocationManagementMenu.studentAllocationMenu();
        } else if(number == 0) {
            return;
        } else {
            System.out.println("Invalid Input");
        }

    }
}
