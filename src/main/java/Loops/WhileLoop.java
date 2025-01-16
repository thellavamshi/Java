package Loops;

public class WhileLoop {

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
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.powerOfN();
        whileLoop.infiniteLoop();
    }
}
