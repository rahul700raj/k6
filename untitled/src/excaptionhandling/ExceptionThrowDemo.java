public class ExceptionThrowDemo {
    // Method to check if the number is positive
    public static void checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        int input = -5; // Test input

        try {
            checkPositive(input);
        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}

