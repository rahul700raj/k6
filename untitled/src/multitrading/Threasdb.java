package multitrading;

 class Threadb extends Thread {
    @Override
    public void run() {
        System.out.println("A start");
        try {
            Thread.sleep(500); // Sleep for 500 milliseconds
        } catch (InterruptedException e) {
            System.out.println("Thread A was interrupted");
        }
        System.out.println("A end");
    }
}



class JoinExample {
        public static void main(String[] args) {
            Threadb threadb = new Threadb(); // Create an instance of ThreadA
            threadb.start(); // Start Thread A

            try {
                threadb.join(); // Wait for Thread A to finish
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted");
            }

            System.out.println("Main after A"); // Print after Thread A has finished
        }
    }


