public class NestedTryCatchExample {
    public static void main(String[] args) {
        String nonIntegerString = "rahul raj";
        int divisor = 0;

        try {

            int number = Integer.parseInt(nonIntegerString);
            try {

                int result = 10 / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: The string is not a valid integer.");
        }
    }
}
