import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a number");
        }

        scanner.close();
    }
}

