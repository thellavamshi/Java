package Loops;

import java.util.Scanner;

public class P4_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiplication table");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " X " + i + " = " + n*i );
        }
    }
}
