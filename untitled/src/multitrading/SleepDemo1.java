package multitrading;

public class SleepDemo1 {
    public static void main(String[] args) {
        // Create and start a new thread
        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Working...");
                    // Pause execution for 500 milliseconds
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
