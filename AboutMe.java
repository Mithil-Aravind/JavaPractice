import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = userInput.nextLine();

        System.out.println("What is your age?");
        int age = userInput.nextInt();

        userInput.nextLine();

        System.out.println("What is your goal?");
        String goal = userInput.nextLine();



        System.out.println("=== About Me ===");
        System.out.println("Name:    " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
    }
}