package DesignPatterns;

public class Test {
    public static void main(String[] args) {
        Runnable task = () ->{
            Browser.getInstance().display();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();


    }
}
