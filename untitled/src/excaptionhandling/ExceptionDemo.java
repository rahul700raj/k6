import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Demonstrating checked exception (FileNotFoundException)
        try {
            FileReader fileReader = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is 0
    }
}
