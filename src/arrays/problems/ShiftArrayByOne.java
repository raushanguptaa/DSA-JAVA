package arrays.problems;

public class ShiftArrayByOne {
    static void getShiftByOne(int[] arr){
        int temp  =arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for (int num: arr){
            System.out.printf("%d ", num);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        getShiftByOne(array);
    }
}
