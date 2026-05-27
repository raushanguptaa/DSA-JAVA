package array;

public class FindMinimum {
    public static void main(String[] args) {

        /*
            Question:
            Find the minimum element in an array.

            Input:
            arr = {4, 7, 2, 9, 1}

            Output:
            Minimum Element: 1
        */





        int[] arr = {4, 7, 2, 9, 1};

        int minValue = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i] < minValue ){
                minValue = arr[i];
            }
        }
        System.out.printf("Minimum Element: %d", minValue);
    }

}
