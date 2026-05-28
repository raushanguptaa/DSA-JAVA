package arrays;

public class ReverseArray {
    public static void main(String[] args) {

        /*
        Question:
        Reverse the elements of an array.

        Input:
        arr = {1, 2, 3, 4, 5}

        Output:
        5 4 3 2 1
    */

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Reversed Array: ");
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
