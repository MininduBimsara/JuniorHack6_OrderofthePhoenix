package org.example;

import org.example.factory.OpertaionFactory;
import org.example.menus.MainMenu;


public class Main {
    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();
        int result = mainMenu.mainMenu();

        OpertaionFactory opertaionFactory = new OpertaionFactory();

        opertaionFactory.selectItemFromMainMenu(result);

    }
}