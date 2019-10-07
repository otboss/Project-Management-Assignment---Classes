import java.util.Scanner;

class Main {
    /** The application's entrypoint */
    public static void main(String args[]) {
        Database.init();
        /** Stores the users menu selection */
        int menuSelection;
        Scanner scanner = new Scanner(System.in);
        // Program Loop
        while (true) {
            Runtime.getRuntime().exec("cls; reset; clear;");
            System.out.printf("Pizza Delivered Quickly!\n\n");
            System.out.printf("=========\n");
            System.out.printf("Main Menu\n");
            System.out.printf("=========\n");
            System.out.printf("Select the desired option:\n\n");
            System.out.printf("0] Exit\n\n");
            System.out.printf("Choice: ");
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Exception occurred\n\n");
                continue;
            }
            switch (menuSelection) {
            case 0:
                System.exit(0);
                break;
            default:

                break;
            }
        }
    }
}
