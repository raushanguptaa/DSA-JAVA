package basicMath;

public class ReverseNumber {
    public static void main(String[] args) {

        /*
        Question:
        Reverse a number.

        Input:
        1234

        Output:
        4321
    */

        int num = 1234;
        int reversedNumber = 0;

        while (num > 0){
            int digit = num%10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num/10;
        }
        System.out.printf("Reverse Number: %d", reversedNumber);

    }
}
