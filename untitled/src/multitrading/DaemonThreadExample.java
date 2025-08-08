package multitrading;

public class DaemonThreadExample {

        public static void main(String[] args) {
            // Create a daemon thread
            Thread daemonThread = new Thread(() -> {
                while (true) {
                    System.out.println("Daemon working");
                    try {
                        Thread.sleep(300); // Sleep for 300ms
                    } catch (InterruptedException e) {
                        // Handle interruption
                        break;
                    }
                }
            });

            // Set the thread as a daemon thread
            daemonThread.setDaemon(true);

            // Start the daemon thread
            daemonThread.start();

            // Main thread sleeps for 1 second
            try {
                System.out.println("Main thread sleeping for 1 second...");
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Main thread exiting...");
            // The program will terminate here, and the daemon thread will be killed
        }
    }


