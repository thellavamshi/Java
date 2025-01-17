package Loops;

public class P1_WhileLoop {

    public void powerOfN(){
        int n=1;
        while(n<100){
            System.out.println(n);
            n = n*2;
        }
    }

    public void infiniteLoop(){
        int n =1;
        while(true){
            System.out.println(n);
            n++;
        }
    }

    public static void main(String[] args) {
        P1_WhileLoop p1WhileLoop = new P1_WhileLoop();
        p1WhileLoop.powerOfN();
        p1WhileLoop.infiniteLoop();
    }
}
