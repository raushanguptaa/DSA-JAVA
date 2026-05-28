package arrays;

public class FindMaximum {
    public static void main(String[] args) {

        /*

        Input:
        4 7 2 9 1

        Output:
        Maximum Element: 9

        */

        int[] arr = {4, 7, 2, 9, 1};

        int maxValue = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i] > maxValue ){
                maxValue = arr[i];
            }
        }
        System.out.printf("Maximum Element: %d", maxValue);
    }
}
