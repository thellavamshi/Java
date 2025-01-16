package Loops;

public class DoWhileLoop {

    public void powerOfN(){
        int n = 1;

        do{
            System.out.println(n);
            n = n * 2;
        }while (n<100);
    }

    public static void main(String[] args) {
        DoWhileLoop doWhileLoop = new DoWhileLoop();
        doWhileLoop.powerOfN();
    }
}
