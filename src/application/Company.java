package application;

import java.util.Locale;

import application.menus.MainMenu;

public class Company {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        MainMenu mainMenu = new MainMenu();
        mainMenu.action();
    }
}