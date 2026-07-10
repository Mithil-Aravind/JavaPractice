import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean doContinue = true;

        while (doContinue) {
            System.out.println("Give me a sentence.");
            String sentence = userInput.nextLine();

            String[] words = sentence.split(" ");
            System.out.println("The amount of words in your sentence is: " + words.length);

            System.out.println("Do you want to go again? Press 'y' to continue or any other key to quit.");
            String again = userInput.nextLine();
            if (!again.equalsIgnoreCase("y")) {
                doContinue = false;
                System.out.println("Goodbye!");
            }
        }
    }
}