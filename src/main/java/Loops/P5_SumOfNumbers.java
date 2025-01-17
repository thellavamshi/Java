package Loops;

public class P5_SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1;i<=10;i++){
            System.out.println(sum);
            sum = sum +i;
        }
        System.out.println("Total sum " + sum);
    }
}
