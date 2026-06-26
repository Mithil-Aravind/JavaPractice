import java.util.Scanner;

public class calculator {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is number one?");

        double numberOne = userInput.nextDouble();

        System.out.println("What is number two?");

        double numberTwo = userInput.nextDouble();

        System.out.println("What is your operation?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        double operation = userInput.nextDouble();

        if (operation == 1) {
            double answer = numberOne + numberTwo;
            System.out.println(numberOne + "+" + numberTwo + "=" + answer);
        } else if (operation == 2) {
            double answer = numberOne - numberTwo;
            System.out.println(numberOne + "-" + numberTwo + "=" + answer);
        } else if (operation == 3) {
            double answer = numberOne * numberTwo;
            System.out.println(numberOne + "*" + numberTwo + "=" + answer);
        } else if (operation == 4) {
            if (numberTwo != 0) {
                double answer = numberOne / numberTwo;
                System.out.println(numberOne + "/" + numberTwo + "=" + answer);
            } else {
                System.out.println("Divide by zero error.");
            }
        } else {
            System.out.println("This is not a valid option.");
        }
    }
}