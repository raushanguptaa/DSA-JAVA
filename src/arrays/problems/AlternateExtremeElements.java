package arrays.problems;

public class AlternateExtremeElements {
    static int[] getAlternateExtremeElements(int[] arr){
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        int index = 0;

        while (left <= right){
            if (left == right){
                result[index++] = arr[left];
            }else {
                result[index++] = arr[left];
                result[index++] = arr[right];
            }
            left++;
            right--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] element = getAlternateExtremeElements(arr);

        System.out.print("Alternate Extreme Element: ");
        for (int num : element){
            System.out.printf("%d ",num);
        }

    }
}
