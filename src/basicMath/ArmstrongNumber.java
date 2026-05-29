package basicMath;

public class ArmstrongNumber {
    public static void main(String[] args) {

        /*
            Question:
            Check whether a number is an Armstrong number or not.

            Input:
            153

            Output:
            Armstrong Number
        */

        int num = 153;
        int originalNum = num;
        int digitCount = 0;
        int sum = 0;
        int temp = num;

        while (temp > 0){
            digitCount++;
            temp = temp / 10;
        }
       temp = num;
        while (temp > 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit, digitCount);
            temp = temp / 10;
        }

        if (sum == originalNum){
            System.out.printf("%d is an Armstrong number.", num);
        }else {
            System.out.printf("%d is not an Armstrong number.", num);
        }
    }
}
