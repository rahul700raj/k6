package multitrading;

public class MYRunnable implements Runnable{
    public void run(){
        System.out.println("thread is runnable condition......");
    }

    public static void main(String[] args) {
        MYRunnable t =new MYRunnable();
        Thread T2 =new Thread(t);
        t.run();
       // MyThread t2 = (MyThread) T2;

    }
}
