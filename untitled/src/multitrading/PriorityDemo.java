package multitrading;

public class PriorityDemo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Priority: " +
                Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PriorityDemo T1 = new PriorityDemo();
        PriorityDemo T2 = new PriorityDemo();

        T1.setPriority(Thread.NORM_PRIORITY);
        T1.start();

        T2.setPriority(Thread.MAX_PRIORITY);
        T2.start();
    }
}