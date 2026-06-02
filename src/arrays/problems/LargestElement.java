package arrays.problems;

public class LargestElement {
    static int getMaxElement(int[] arr){
        int maxElement = arr[0];
        for (int i = 0; i< arr.length; i++){
//            if (arr[i] > maxElement){
//                maxElement = arr[i];
            maxElement = Math.max(maxElement, arr[i]);

        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] array = {1,2,5,6,4,9,5,7,9,23};
        System.out.printf("Largest ELement: %d", getMaxElement(array));
    }
}
