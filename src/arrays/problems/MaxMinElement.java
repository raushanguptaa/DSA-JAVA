package arrays.problems;

public class MaxMinElement {
    /*

    Question:
    Find both maximum and minimum elements in an array.

    */

    static int[] getMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int num : arr){
            if (num > max){
                max = num;
            }
            if (num <min) {
                min = num;
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 25, 2, 18};
        int[] result = getMaxMin(array);
        System.out.printf("Minimum Element: %d%nMaximum ELement: %d%n", result[0], result[1]);
    }
}
