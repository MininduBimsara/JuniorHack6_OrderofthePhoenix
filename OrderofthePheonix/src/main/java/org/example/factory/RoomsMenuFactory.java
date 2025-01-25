package org.example.factory;

import org.example.InputHandler.HostelInputhandler;
import org.example.InputHandler.RoomInputHandler;
import org.example.Services.HostelService;
import org.example.menus.MainMenu;

public class RoomsMenuFactory {

    public void selectMenuItem(int number) {
        RoomInputHandler roomsInputhandler = new RoomInputHandler();

        if (number == 1) {
            roomsInputhandler.add();
        } else if (number == '2') {
            roomsInputhandler.update();
        } else if (number == '3') {
            roomsInputhandler.view();
        } else if (number == '4') {
            roomsInputhandler.remove();
        } else if (number == '0') {
            OpertaionFactory opertaionFactory = new OpertaionFactory();
            opertaionFactory.selectItemFromMainMenu(1);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
