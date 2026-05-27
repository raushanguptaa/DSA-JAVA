package array;

public class CountEvenOdd {
    public static void main(String[] args) {

        /*
    Question:
    Count total even and odd numbers in an array.

    Input:
    arr = {1, 2, 3, 4, 5, 6}

    Output:
    Even Count: 3
    Odd Count: 3
*/

        int[] arr = {1, 2, 3, 4, 5, 6};
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                countEven++;
            }else {
                countOdd++;
            }

        }
        System.out.printf("Even Count: %d\nOdd Count: %d",countEven, countOdd);


    }
}
