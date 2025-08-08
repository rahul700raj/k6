public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            // Attempting to perform division by zero
            int result = 5 / 0;
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        } finally {

            System.out.println("Execution Completed.");
        }
    }
}
