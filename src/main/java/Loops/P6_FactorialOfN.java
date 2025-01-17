package Loops;

import java.util.Scanner;

public class P6_FactorialOfN {

    public void factorialOfN(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();
        int factorial = 1;

        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial " + factorial );
    }

    public static void main(String[] args) {
        P6_FactorialOfN p5FactorialOfN = new P6_FactorialOfN();
        p5FactorialOfN.factorialOfN();
    }
}
