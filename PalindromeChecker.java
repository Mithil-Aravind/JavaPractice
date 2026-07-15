import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("=== Palindrome Checker ===");
        boolean doContinue = true;

        while (doContinue) {
            System.out.println("What is the word you want to check?");
            String word = userInput.nextLine();
            boolean isPalindrome = true;
            for (int i = 0, j = word.length() - 1; i <= j; i++, j--) {
                char first = word.charAt(i);
                char last = word.charAt(j);
                if (first == last) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                }
            }

            if (isPalindrome) {
                System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " isn't a palindrome");
            }
            System.out.println("Do you want to check again. Press 'y' to continue or any other key to quit.");
            String again = userInput.nextLine();

            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                doContinue = false;
            }
        }
    }
}