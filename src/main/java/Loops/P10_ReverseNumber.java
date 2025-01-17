package Loops;

import java.util.Scanner;

public class P10_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number1 = sc.nextInt();
        int number = number1;
        int rev=0, remainder;

        while (number>0){
            remainder = number % 10;
            rev = rev*10+remainder;
            number = number/10;
        }

        System.out.println(rev);
    }
}
