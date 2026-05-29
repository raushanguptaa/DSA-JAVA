package basicMath;

public class PalindromeNumber {
    public static void main(String[] args) {
        /*
        Question:
        Check whether a number is palindrome or not.

        Input:
        121

        Output:
        Palindrome Number
    */

        int num = 121;
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        if (originalNum == reversedNum){
            System.out.printf("%d is a palindrome number.", originalNum);
        }else {
            System.out.printf("%d is not a palindrome number.", originalNum);
        }
    }
}
