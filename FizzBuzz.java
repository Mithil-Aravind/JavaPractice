import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
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
    }
}