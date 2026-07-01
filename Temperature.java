import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Temperature Converter ===");
        boolean doContinue = true;
        while (doContinue) {
            Scanner userInput = new Scanner(System.in);

            System.out.println("1. C->F");
            System.out.println("2. F->C");
            double type = userInput.nextDouble();

            System.out.println("How many degrees is it? ");
            double degrees = userInput.nextDouble();


            if (type == 1) {
                double converted = degrees * (9.0 / 5) + 32;
                System.out.println(degrees + " celsius is " + converted + " fahrenheit");
            } else if (type == 2) {
                double converted = (degrees - 32) * 5.0 / 9;
                System.out.println(degrees + " fahrenheit is " + converted + " celsius");
            }

            userInput.nextLine();
            System.out.println("Do you want to continue? Press 'y' to continue or press any other key to quit.");
            String again = userInput.nextLine();
            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                doContinue = false;
            }
        }
    }
}