package arrays.problems;

public class PalindromeArray {
//    Check whether the array is a palindrome.
    static String checkPalindromeArray(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            if (arr[left] != arr[right]){
                return "Not Palindrome";
            }
            left++;
            right--;
        }
        return "Palindrome";
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        System.out.println(checkPalindromeArray(array));
    }
}
