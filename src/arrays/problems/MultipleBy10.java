package arrays.problems;

public class MultipleBy10 {
    //Multiple each elements of array by 10.
    static int[] multipleBy10(int[] arr){
        int size = arr.length;
        int[] newArray = new int[size];

        for (int i=0; i<size; i++){
            int element = arr[i];
            newArray[i] = element*10;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6};
        int[] newArray = multipleBy10(array);

        System.out.print("array: ");
        for (int i: newArray){
            System.out.print(i+" ");
        }
    }

}
