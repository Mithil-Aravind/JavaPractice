import java.util.Scanner;
import java.util.HashMap;

public class BankAccount {
    public static HashMap<String, Double> accounts = new HashMap<>();
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Welcome to Mithil & Co. Banking ===");
        boolean doContinue = true;

        while (doContinue) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit.");
            System.out.print("Enter choice: ");

            try {
                int userChoice = Integer.parseInt(userInput.nextLine());

                if (userChoice == 1) {
                    createAccount();
                } else if (userChoice == 2) {
                    deposit();
                } else if (userChoice == 3) {
                    withdraw();
                } else if (userChoice == 4) {
                    double balance = getBalance();
                    if (balance != -1) {
                        System.out.println("$" + balance);
                    }
                } else if (userChoice == 5) {
                    System.out.println("Thank you for banking at Mithil & Co. Hope to see you again soon!");
                    doContinue = false;
                } else {
                    System.out.println("That is not a valid option. Quitting program now...");
                    doContinue = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid numeric choice.");
            }
        }
    }

    public static void createAccount() {
        System.out.println("What is the name for the account?");
        String accountName = userInput.nextLine();
        System.out.println("What is the starting balance?");
        double accountBalance = Double.parseDouble(userInput.nextLine());

        accounts.put(accountName, accountBalance);
        System.out.println("Account created successfully!");
    }

    public static void deposit() {
        System.out.println("What is the account name?");
        String name = userInput.nextLine();

        if (accounts.containsKey(name)) {
            System.out.println("How much do you want to deposit?");
            double dep = Double.parseDouble(userInput.nextLine());
            double newBal = accounts.get(name) + dep;
            accounts.put(name, newBal);
            System.out.println("Deposited $" + dep + ". New balance: $" + newBal);
        } else {
            System.out.println("There is no account under that name.");
        }
    }

    public static void withdraw() {
        System.out.println("What is the name for the account?");
        String name = userInput.nextLine();

        if (accounts.containsKey(name)) {
            System.out.println("How much do you want to withdraw?");
            double withDrawal = Double.parseDouble(userInput.nextLine());

            if (withDrawal > 0) {
                if (accounts.get(name) < withDrawal) {
                    System.out.println("You do not have that much money in your account.");
                } else {
                    double newBal = accounts.get(name) - withDrawal;
                    accounts.put(name, newBal);
                    System.out.println("Your new balance is: $" + newBal);
                }
            } else if (withDrawal == 0) {
                System.out.println("You cannot withdraw $0");
            } else {
                System.out.println("You cannot withdraw a negative amount");
            }
        } else {
            System.out.println("There is no account under that name.");
        }
    }

    public static double getBalance() {
        System.out.println("For what name?");
        String name = userInput.nextLine();

        if (accounts.containsKey(name)) {
            return accounts.get(name);
        } else {
            System.out.println("There is no account under that name.");
            return -1;
        }
    }
}
