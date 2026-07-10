import java.util.Scanner;

public class MaxMinAvg {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        boolean doContinue = true;
        while (doContinue) {
            double[] numbers = new double[4];

            System.out.println("What is the first number?");
            double numberOne = userInput.nextInt();
            userInput.nextLine();

            System.out.println("What is the second number?");
            double numberTwo = userInput.nextInt();
            userInput.nextLine();

            System.out.println("What is the third number?");
            double numberThree = userInput.nextInt();
            userInput.nextLine();

            System.out.println("What is the fourth number?");
            double numberFour = userInput.nextInt();
            userInput.nextLine();

            numbers[0] = numberOne;
            numbers[1] = numberTwo;
            numbers[2] = numberThree;
            numbers[3] = numberFour;

            double max = numbers[0];
            double min = numbers[0];
            double avg = numbers[0];

            for (double n : numbers) {
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            }

            avg = (numberOne + numberTwo + numberThree + numberFour) / numbers.length;

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + avg);

            System.out.println("Do you want to go again? Press 'y' to continue and any other key to quit.");
            String again = userInput.nextLine();
            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye");
                doContinue = false;
            }
        }
    }
}