class CheckerThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Checking...");
            try {
                Thread.sleep(200); // Sleep for 200ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadLivenessExample {
    public static void main(String[] args) {
        // Create a thread named "Checker" with priority above normal
        CheckerThread checker = new CheckerThread();
        checker.setName("Checker");
        checker.setPriority(Thread.NORM_PRIORITY + 1); // Set priority above normal

        // Start the thread
        checker.start();

        // Print thread details
        System.out.println("Thread Name: " + checker.getName());
        System.out.println("Thread Priority: " + checker.getPriority());
        System.out.println("Is Alive (before join): " + checker.isAlive());

        // Wait for the thread to finish
        try {
            checker.join(); // Wait for the checker thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive after join
        System.out.println("Is Alive (after join): " + checker.isAlive());
    }
}
