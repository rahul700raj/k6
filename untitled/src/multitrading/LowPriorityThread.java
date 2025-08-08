package multitrading;

public class LowPriorityThread extends Thread{
        public void run() {
            for (int i = 0; i < 30; i++) {
                System.out.println("Low");
            }
        }
    }

    class HighPriorityThread extends Thread {
        public void run() {
            for (int i = 0; i < 30; i++) {
                System.out.println("High");
            }
        }
    }

    class ThreadPriorityExample {
        public static void main(String[] args) {
            // Create threads
            LowPriorityThread lowThread = new LowPriorityThread();
            HighPriorityThread highThread = new HighPriorityThread();

            // Set priorities
            lowThread.setPriority(Thread.MIN_PRIORITY); // Low priority
            highThread.setPriority(Thread.MAX_PRIORITY); // High priority

            // Print thread priorities
            System.out.println("Low Thread Priority: " + lowThread.getPriority());
            System.out.println("High Thread Priority: " + highThread.getPriority());

            // Start threads
            lowThread.start();
            highThread.start();


        }
    }


