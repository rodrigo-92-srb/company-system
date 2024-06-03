package application.menus;

import java.util.Scanner;

public class EmployeesMenu implements Menu {

    @Override
    public void showMenu() {
        System.out.println("----- Employees Panel -----");
        System.out.println("[1] - Manager Menu");
        System.out.println("[2] - Operator Menu");
        System.out.println("[0] - Back to Main Menu");
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
                    ManagerMenu managerMenu = new ManagerMenu();
                    managerMenu.action();
                    break;
                case 2:
                    // Placeholder for OperatorMenu action
                    // OperatorMenu operatorMenu = new OperatorMenu();
                    // operatorMenu.action();
                    System.out.println("Operator Menu not implemented yet.");
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            
        }
    }
}
