package arrays.problems;

public class ReverseArray {
    static void getReverseArray(int[] arr){
        int left =0;
        int right = arr.length-1;

        while (left <= right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;

           left++;
           right--;

           }
        for (int num: arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        System.out.print("Reversed Elements: ");
       getReverseArray(array);
    }
}
