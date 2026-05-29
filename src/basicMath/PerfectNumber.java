package basicMath;

public class PerfectNumber {
    public static void main(String[] args) {

        /*
            Question:
            Check whether a number is a Perfect Number or not.

            Input:
            6

            Output:
            Perfect Number
        */

        int num = 6;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                sum += i;
            }
        }
        if (sum == num){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Perfect Number");
        }

    }
}
