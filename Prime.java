import java.util.Scanner;

public class Prime {
    static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("=== Prime Numbers ===");
        boolean doContinue = true;
        while (doContinue) {
            System.out.println("1. Print prime numbers 1-50");
            System.out.println("2. Check if a given number is prime");
            int userChoice = userInput.nextInt();

            if (userChoice == 1) {
                for (int n = 1; n <= 50; n++) {
                    if (isPrime(n)) {
                        System.out.print(n + " ");
                    }
                }
                System.out.println();
            } else if (userChoice == 2) {
                userInput.nextLine();
                System.out.println("What number do you want to check?");
                int userNumber = userInput.nextInt();

                if (isPrime(userNumber)) {
                    System.out.println(userNumber + " is prime.");
                } else {
                    System.out.println(userNumber + " is not prime.");
                }
            } else {
                System.out.println("That is not a valid option.");
            }
            userInput.nextLine();
            System.out.println("Do you want to go again? Press 'y' to continue and any other key to quit.");
            String again = userInput.nextLine();

            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                doContinue = false;
            }
        }
    }
}