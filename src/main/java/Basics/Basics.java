package Basics;

public class Basics {
    int a, b;

    public void sum(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Basics b = new Basics();
        b.sum(10,20);
    }
}
