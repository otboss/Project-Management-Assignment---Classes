import java.io.IOException;
import java.util.Scanner;

import classes.Order;
import classes.database.Database;
import classes.pizza_factory_locator_subsystem.PizzaLocator;

class Main {

    public static void clearConsole() throws IOException, InterruptedException {
        try {
            // Windows
            new ProcessBuilder("cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            // MacOS & Linux
            new ProcessBuilder("clear").inheritIO().start().waitFor();
            // Linux
            new ProcessBuilder("reset").inheritIO().start().waitFor();
        }
    }

    public static void main(String args[]) throws IOException, InterruptedException {
        /** Stores the users menu selection */
        int menuSelection;
        Scanner scanner = new Scanner(System.in);

        // Program Loop
        while (true) {
            // MongoClient mongoClient = new MongoClient();
            clearConsole();
            System.out.printf("\nPizza Delivered Quickly!\n\n");
            System.out.printf("=========\n");
            System.out.printf("Main Menu\n");
            System.out.printf("=========\n");
            System.out.printf("Select the desired option:\n\n");
            System.out.printf("1] Determine new pizza factory locations\n");
            System.out.printf("0] Exit\n\n");
            System.out.printf("Choice: ");
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Exception occurred\n\n");
                continue;
            }
            switch (menuSelection) {
            case 1:
                clearConsole();
                Order[] orders = Database.getOrders();
                PizzaLocator.determinePizzaFactoryLocations(orders);
                break;
            case 0:
                clearConsole();
                System.exit(0);
                break;
            default:
                break;
            }
        }

    }
}
