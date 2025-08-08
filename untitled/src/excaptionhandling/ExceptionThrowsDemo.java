import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionThrowsDemo {
    // Method that declares it may throw FileNotFoundException
    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("non_existent_file.txt"); // Attempt to read a non-existent file
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
