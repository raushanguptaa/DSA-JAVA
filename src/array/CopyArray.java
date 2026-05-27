package array;

public class CopyArray {
    public static void main(String[] args) {

        /*
        Question:
        Copy all elements from one array to another array.

        Input:
        arr = {1, 2, 3, 4, 5}

        Output:
        Copied Array:
        1 2 3 4 5
    */
        int[] arr = {1, 2, 3, 4, 5};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            copy[i] = arr[i];
        }


        System.out.println("Copied Array: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
