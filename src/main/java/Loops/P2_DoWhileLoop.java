package Loops;

public class P2_DoWhileLoop {

    public void powerOfN(){
        int n = 1;

        do{
            System.out.println(n);
            n = n * 2;
        }while (n<100);
    }

    public static void main(String[] args) {
        P2_DoWhileLoop p2DoWhileLoop = new P2_DoWhileLoop();
        p2DoWhileLoop.powerOfN();
    }
}
