import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("=== Multiplication Table ===");
        boolean doContinue = true;

        while (doContinue) {

            System.out.println("1. Table for one given number");
            System.out.println("2. Complete 1-12 Grid");
            int menuChoice = userInput.nextInt();

            if (menuChoice == 1) {
                userInput.nextLine();
                System.out.println("What is the number?");
                double n = userInput.nextDouble();
                for (int i = 1; i < 13; i++) {
                    System.out.println(n * i);
                }
            } else if (menuChoice == 2) {
                System.out.println("------------------------------------");
                for (int n = 1; n <= 12; n++) {
                    for (int i = 1; i <= 12; i++) {
                        System.out.print((n * i) + "\t");
                    }
                    System.out.println();
                }
            }
            userInput.nextLine();
            System.out.println("Do you want to continue? Press 'y' to continue or any other key to quit.");
            String again = userInput.nextLine();
            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                doContinue = false;
            }
        }
    }
}