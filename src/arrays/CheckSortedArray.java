package arrays;

public class CheckSortedArray {
    public static void main(String[] args) {


        /*
        Question:
        Check whether the array is sorted in ascending order or not.

        Input:
        arr = {1, 2, 3, 4, 5}

        Output:
        Array is sorted
    */
        int[] arr = {1, 2, 3, 4, 5};

        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                System.out.println("Array is not sorted.");
                return;
            }

        }
        System.out.println("Array is sorted");

    }
}
