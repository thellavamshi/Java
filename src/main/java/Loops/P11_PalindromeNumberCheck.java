package Loops;

import java.util.Scanner;

public class P11_PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int dummyNumber = number;

        int rev=0, remainder;

        while(dummyNumber>0){
            remainder = dummyNumber%10;
            rev = rev * 10 + remainder;
            dummyNumber = dummyNumber/10;
        }
        if(rev == number){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
