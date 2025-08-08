package multitrading;

    class CustomRunnable implements Runnable {
        @Override
        public void run() {
            // Print the current thread's name
            System.out.println("Running in: " + Thread.currentThread().getName());
        }

        public static void main(String[] args) {
            Thread thread = new Thread(new CustomRunnable(), "CustomThread"); // Create a thread with the name "CustomThread"
            thread.start(); // Start the thread
        }
    }


