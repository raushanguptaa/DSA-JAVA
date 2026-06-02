package arrays.problems;

public class AverageOfArray {
    // Find the average of array elements
    static double findAverageOfArray(int[] arr){
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        System.out.printf("Average of Array: %.2f",findAverageOfArray(arr));

    }
}
