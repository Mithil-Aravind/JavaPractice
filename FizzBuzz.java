import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("=== Welcome to FizzBuzz ===");
        Scanner userInput = new Scanner(System.in);
        boolean doContinue = true;
        while (doContinue) {
            System.out.println("What is the fizz number?");
            int fizz = userInput.nextInt();
            userInput.nextLine();
            System.out.println("What is the buzz number?");
            int buzz = userInput.nextInt();

            for (int n = 0; n < 101; n++) {
                if (n % (fizz * buzz) == 0) {
                    System.out.println("fizzbuzz");
                } else if (n % fizz == 0) {
                    System.out.println("fizz");
                } else if (n % buzz == 0) {
                    System.out.println("buzz");
                } else {
                    System.out.println(n);
                }
            }
            userInput.nextLine();
            System.out.println("Do you want to continue? Press y to continue. any other key to quit");
            String again = userInput.nextLine();
            if (!again.equalsIgnoreCase("y")){
                doContinue = false;
            }
        }
    }
}