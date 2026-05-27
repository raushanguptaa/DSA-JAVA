package array;

public class SecondLargest {
    public static void main(String[] args) {

        /*

    Question:
    Find the second-largest element in an array.

    Input:
    arr = {4, 7, 2, 9, 1}

    Output:
    Second-Largest Element: 7

    */
        int[] arr = {4, 7, 2, 9, 1};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];

            }else if (arr[i] > secondLargest){
                largest = arr[i];
            }
        }
        System.out.print("Second largest Element: "+ secondLargest);

    }
}
