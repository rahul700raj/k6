class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200); // Delay of 200 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println("Thread was interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Task task = new Task(); // Create an instance of Task
        Thread thread = new Thread(task); // Wrap Task in a Thread
        thread.start(); // Start the thread
    }
}
