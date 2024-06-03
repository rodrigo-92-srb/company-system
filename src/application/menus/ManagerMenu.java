package application.menus;

import java.util.Scanner;

public class ManagerMenu implements Menu{

    @Override
    public void showMenu() {
        System.out.println("----- Manager -----");
        System.out.println("[1] - List Manager");
        System.out.println("[2] - Create Manager");
        System.out.println("[3] - Update Manager");
        System.out.println("[4] - Delete Manager");
        System.out.println("[0] - Back to Employees Panel");
        System.out.println("Select an option: ");
    }

    @Override
    public void clearMenu() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            clearMenu();
            showMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // listManager();
                    break;
                case 2:
                    createManager();                    
                    break;
                case 3:
                    // updateManager();
                    break;
                case 4:
                    // deleteManager();
                    break;
                case 0:
                    System.out.println("Returning to Employees Panel...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public void createManager() {
        //Manager manager = new Manager("Manager1", 2500, 500, 3);
        // Logic to save the manager (e.g., adding to a list or database)
    }
}
