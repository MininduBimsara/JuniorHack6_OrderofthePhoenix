package org.example.factory;

import org.example.InputHandler.StudentInputHandler;
import org.example.Services.MainService;

public class StudentMenuFactory {

    public void selectMenuItem(int number) {
        StudentInputHandler studentInputHandler = new StudentInputHandler();

        if (number == 1) {
            studentInputHandler.add();
        } else if (number == 2) {
            studentInputHandler.remove();
        } else if (number == 3) {
            studentInputHandler.update();
        } else if (number == 4) {
            studentInputHandler.view();
        } else if (number == 0) {
            MainService mainService = new MainService();
            mainService.mainMenu();
        } else {
            System.out.println("Invalid Input");
        }
    }
}
