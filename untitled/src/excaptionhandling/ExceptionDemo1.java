public class ExceptionDemo1 {

    public static void main(String[] args) {
        try {
            performTask();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    static void performTask() throws Exception {
        try {
            riskyOperation();
        } catch (Exception e) {
            // Log the exception
            System.out.println("Exception caught in performTask: " + e.getMessage());

            // Re-throw the exception
            throw e;
        }
    }

    static void riskyOperation() throws Exception {
        // Simulate an exception
        throw new Exception("Something went wrong in riskyOperation");
    }
}

