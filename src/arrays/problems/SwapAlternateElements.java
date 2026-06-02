package arrays.problems;

public class SwapAlternateElements {
    static int[] swapAlternateElements(int[] arr){
        for (int i = 0; i < arr.length-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        int[] result = swapAlternateElements(array);
        System.out.print("Swap Alternate Elements: ");
        for (int num: result){
            System.out.printf("%d ", num);
        }

    }
}
