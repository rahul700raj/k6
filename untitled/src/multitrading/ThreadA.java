class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("A start");
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread A was interrupted");
        }
        System.out.println("A end");
    }
}

 class JoinDemo {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA(); // Create an instance of ThreadA
        threadA.start(); // Start Thread A

        try {
            threadA.join(); // Wait for Thread A to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Main after A"); // Print after Thread A has finished
    }
}
