package arrays.problems;

public class FirstUnsortedElement {
    static int findFirstOutOfOrderElement(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] < arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5,6};
        System.out.printf("Unsorted Element: %d", findFirstOutOfOrderElement(array));
    }
}
