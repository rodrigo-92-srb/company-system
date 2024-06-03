package application.menus;

import java.util.Scanner;

public class MainMenu implements Menu {

    @Override
    public void showMenu() {
        System.out.println("----- Main -----");
        System.out.println("[1] - Employees Panel");
        System.out.println("[2] - Payments Panel");
        System.out.println("[3] - Sector Panel");
        System.out.println("[0] - Exit");
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
                    EmployeesMenu employeesMenu = new EmployeesMenu();
                    employeesMenu.action();
                    break;
                case 2:
                    // Payments panel handling code
                    break;
                case 3:
                    // Sector panel handling code
                    break;
                case 0:
                	System.out.println("System finished..."); 
                	scanner.close();
                	System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            
        }
    }
}
