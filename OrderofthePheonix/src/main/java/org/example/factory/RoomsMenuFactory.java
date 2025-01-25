package org.example.factory;

import org.example.InputHandler.HostelInputhandler;
import org.example.InputHandler.RoomInputHandler;

public class RoomsMenuFactory {

    public void selectMenuItem(int number) {
        RoomsInputhandler roomsInputhandler = new RoomInputHandler();

        if (number == 1) {
            roomsInputhandler.add();
        } else if (number == '2') {
            roomsInputhandler.update();
        } else if (number == '3') {
            roomsInputhandler.view();
        } else if (number == '4') {

        } else if (number == '0') {

        } else {
            System.out.println("Invalid Input");
        }
    }
}
