package Arrays;

public class P2_SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {2,4,6};
        int sum=0;
        for(int i=0;i<=array.length-1;i++){
            sum = sum + array[i];
        }
        System.out.println("Total sum of array elements: " + sum);

        int sum2=0;
        for(int total : array){
            sum2 = sum2 + total;
        }
        System.out.println("Total using for each loop: " + sum2);
    }
}
