import java.util.Scanner;

public class Robot {
    static int[] position = {0, 0};
    static int x = 0;
    static int y = 0;

    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean doContinue = true;

        while (doContinue) {
            System.out.println("\n1. Move Forward");
            System.out.println("2. Go Backward");
            System.out.println("3. Go Right");
            System.out.println("4. Go Left");
            System.out.println("5. Get Current Position");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int userChoice = userInput.nextInt();

            if (userChoice == 1) {
                System.out.print("How many spaces forward are you going? ");
                int spaces = userInput.nextInt();
                moveForward(spaces);
            } else if (userChoice == 2) {
                System.out.print("How many spaces backward are you going? ");
                int spaces = userInput.nextInt();
                moveBackward(spaces);
            } else if (userChoice == 3) {
                System.out.print("How many spaces right are you going? ");
                int spaces = userInput.nextInt();
                moveRight(spaces);
            } else if (userChoice == 4) {
                System.out.print("How many spaces left are you going? ");
                int spaces = userInput.nextInt();
                moveLeft(spaces);
            } else if (userChoice == 5) {
                int[] currentPosition = getPosition();
                System.out.println("Current Coordinates (X, Y):");
                for (int n : currentPosition) {
                    System.out.print(n + " ");
                }
            } else if (userChoice == 6) {
                System.out.println("Goodbye!");
                doContinue = false;
            } else {
                System.out.println("That is not a valid option. Goodbye!");
                doContinue = false;
            }
        }
        userInput.close();
    }

    public static void moveForward(int yaxis) {
        position[1] += yaxis;
        System.out.println("Your robot has moved " + yaxis + " spaces further.");
    }

    public static void moveBackward(int yaxis) {
        position[1] -= yaxis;
        System.out.println("Your robot has moved " + yaxis + " spaces backward.");
    }

    public static void moveRight(int xaxis) {
        position[0] += xaxis;
        System.out.println("Your robot has moved " + xaxis + " spaces right.");
    }

    public static void moveLeft(int xaxis) {
        position[0] -= xaxis;
        System.out.println("Your robot has moved " + xaxis + " spaces left.");
    }

    public static int[] getPosition() {
        return position;
    }
}
