import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        boolean keepGoing = true;
        while (keepGoing) {

            Scanner userInput = new Scanner(System.in);

            System.out.println("How many degrees is it? ");
            double degrees = userInput.nextDouble();


            System.out.println("1. C->F");
            System.out.println("2. F->C");
            System.out.println("3. Exit.");
            double type = userInput.nextDouble();

            if (type == 1) {
                double converted = degrees * (9.0 / 5) + 32;
                System.out.println(degrees + " celsius is " + converted + " fahrenheit");
            } else if (type == 2) {
                double converted = (degrees - 32) * 5.0 / 9;
                System.out.println(degrees + " fahrenheit is " + converted + " celsius");
            } else if (type == 3) {
                System.out.println("Goodbye!");
                keepGoing = false;
            }
        }
    }
}