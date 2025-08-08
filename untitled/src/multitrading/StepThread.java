class StepThread extends Thread {
    @Override
    public void run() {
        System.out.println("Step 1");
        try {
            Thread.sleep(400); // Sleep for 400 milliseconds
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted during sleep.");
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        System.out.println("Step 2");
    }

    public static void main(String[] args) {
        StepThread stepThread = new StepThread(); // Create an instance of StepThread
        stepThread.start(); // Start the thread
    }
}
