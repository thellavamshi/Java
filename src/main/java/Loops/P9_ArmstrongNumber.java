package Loops;

import java.util.Scanner;

public class P9_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = sc.nextInt();

        int dummyNumber = number;
        int sum = 0;
        int reminder = 0;

        while(dummyNumber > 0){
            reminder = dummyNumber%10;
            dummyNumber = dummyNumber/10;
            sum=sum + reminder * reminder * reminder * reminder;
        }
        if(number == sum){
            System.out.println("Is Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }


    }
}
