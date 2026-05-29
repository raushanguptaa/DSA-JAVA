package basicMath;

public class SumOfDigits {
    public static void main(String[] args) {

        /*
        Question:
        Find the sum of digits of a number.

        Input:
        1234

        Output:
        Sum of Digits: 10
    */

        int num = 1234;
        int digitSum = 0;

        while (num > 0){
            digitSum += num % 10;
            num = num / 10;
        }
        System.out.print("Sum of Digits: "+digitSum);
    }
}
