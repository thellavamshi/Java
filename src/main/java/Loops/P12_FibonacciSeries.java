package Loops;

import java.util.Scanner;

public class P12_FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = sc.nextInt();
        System.out.println("Enter B value");
        int b = sc.nextInt();
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        System.out.print(a + ", " + b + ", ");
        for(int i=0;i<n-2;i++){
            int c = a+b;
            System.out.print(c + ", ");
            a=b;
            b=c;
        }
    }
}
