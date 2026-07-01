import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("=== Guess The Number ===");
        boolean doContinue = true;
        while (doContinue) {
            boolean correct = false;
            int computerChoice = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            while (!correct) {
                System.out.println("Guess a number from 1-100");
                int userGuess = userInput.nextInt();
                if (userGuess == computerChoice) {
                    attempts++;
                    System.out.println("Correct. Attempts: " + attempts);
                    correct = true;
                } else if (userGuess < computerChoice) {
                    attempts++;
                    System.out.println("Wrong. Too low.");
                } else {
                    attempts++;
                    System.out.println("Wrong. Too high.");
                }
            }
            userInput.nextLine();
            System.out.println("Do you want to play again? Press y to play again and any other key to quit.");
            String again = userInput.nextLine();
            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                doContinue = false;
            }
        }
    }
}