package org.example.factory;

import org.example.InputHandler.StudentAllocationInputHandler;
import org.example.Services.MainService;

public class StudentAllocationMenuFactory {

    public void selectMenuItem(int number) {
        StudentAllocationInputHandler studentAllocationInputHandler = new StudentAllocationInputHandler();

        if (number == 1) {
            studentAllocationInputHandler.add();
        } else if (number == 2) {
            studentAllocationInputHandler.remove();
        } else if (number == 3) {
            studentAllocationInputHandler.view();
        } else if (number == 0) {
            MainService mainService = new MainService();
            mainService.mainMenu();
        } else {
            System.out.println("Invalid Input");
        }
    }
}
