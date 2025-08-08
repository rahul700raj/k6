package Classobject;

public class car {
    int add(int a ,int b){
        return a+b;
    }

    public static void main(String[] args) {
        car c1 = new car();

        int result=c1.add( 12 ,  15);
        System.out.println("sum of a and b is: " + result);
    }
}
