package array;

public class LinearSearch {
    public static void main(String[] args) {
        /*
    Question:
    Search an element in an array using Linear Search.

    Input:
    arr = {4, 7, 2, 9, 1}
    target = 9

    Output:
    Element found at index: 3
*/

        int[] arr = {4, 7, 2, 9, 1};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                System.out.printf("Element found at index: %d", i);
                return;

            }
        }
        System.out.println("Element not found");
    }
}
