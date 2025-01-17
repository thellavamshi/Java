package Loops;

import java.util.Scanner;

public class P7_DisplayDigits {

    public int  displayDigits() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int reminder;
        while(number > 0){
            reminder = number % 10;
            number = number/10;
            System.out.println(reminder);
        }
        return 0;
    }

    public static void main(String[] args) {
        P7_DisplayDigits p7DisplayDigits = new P7_DisplayDigits();
        System.out.println(p7DisplayDigits.displayDigits());
    }


}
