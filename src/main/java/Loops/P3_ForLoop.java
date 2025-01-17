package Loops;

public class P3_ForLoop {

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

    public void multipleVariables(){
        for(int i=1, j=1; i<=10 ; i++, j=j*2){
            System.out.println(i+ " "+j);
        }
    }

    public static void main(String[] args) {
        P3_ForLoop p3ForLoop = new P3_ForLoop();
        p3ForLoop.increment();
        p3ForLoop.decrement();
        p3ForLoop.multipleVariables();
    }
}
