package multitrading;

public class CustomThread extends Thread {
    public CustomThread() {
        // Set the thread name to "Worker-1"
        this.setName("Worker-1");
    }

    @Override
    public void run() {
        // Print the thread's name
        System.out.println("Thread " + getName() + " is running.");
    }

    public static void main(String[] args) {
        CustomThread thread = new CustomThread(); // Create an instance of CustomThread
        thread.start(); // Start the thread

    }
}