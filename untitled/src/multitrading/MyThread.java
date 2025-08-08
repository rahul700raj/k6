package multitrading;

public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread T1 = new MyThread();
       // T1.run();
        T1.start();
    }
}
