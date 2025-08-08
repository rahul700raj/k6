package multitrading;

public class SleepDemo extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
        }
        System.out.println(i +"" + Thread.currentThread().getName());
    }
}

public static void main(String[] args) {
    SleepDemo T1=new SleepDemo();
            T1.start();
}
}
