package multitrading;

public class AliveDemo extends Thread{
    public void run(){
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        AliveDemo T1 =new AliveDemo();
        System.out.println(T1.isAlive());
        T1.start();
        System.out.println(T1.isAlive());
    }
}
