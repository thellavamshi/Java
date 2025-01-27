package Arrays;

public class P4_MaxElementInArray {
    public static void main(String[] args) {
        int array[] = {1,3,4,5,6,8,22,44,55, 65};

        int max = array[1];

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
