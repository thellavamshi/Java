package Arrays;

public class P1_ArrayDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        array[0]=22;

        int []a = new int[3];

        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " - ");
        }

        System.out.println("");
        for(int x : array){
            System.out.print(x +" * ");
        }


    }
}
