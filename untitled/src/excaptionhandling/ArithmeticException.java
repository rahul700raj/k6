import java.util.Scanner;

class DivisionByZeroException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting input from the user
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Attempting to perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}
