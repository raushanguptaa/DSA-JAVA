package array;

public class AverageOfArray {
    public static void main(String[] args) {
        /*
        Question:
        Find the average of all elements in an array.

        Input:
        arr = {10, 20, 30, 40, 50}

        Output:
        Average: 30.0
    */
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = (float) sum / arr.length;
        System.out.printf("Average: %.1f", average);
    }
}
