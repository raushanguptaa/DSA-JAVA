package arrays.basics;

public class ArraySum {
    public static void main(String[] args) {


         /*
        Question:
        Find the sum of all elements in an array.

        Input:
        1 2 3 4 5

        Output:
        Array Elements:
        1 2 3 4 5

        Sum: 15
     */

        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;

        System.out.println("Array elements:");
        for(int val: arr){

            System.out.print(val + " ");
            sum += val;

        }
        System.out.println("\nSum: "+ sum);
    }
}
