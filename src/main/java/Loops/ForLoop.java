package Loops;

public class ForLoop {

    public void increment(){
        for(int i=1; i<=10 ; i++){
            System.out.println(i);
        }
        System.out.println("------------------------------------");
    }

    public void decrement(){
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        ForLoop forLoop = new ForLoop();
        forLoop.increment();
        forLoop.decrement();
    }
}
