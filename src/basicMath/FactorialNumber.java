package basicMath;

public class FactorialNumber {
    public static void main(String[] args) {

        /*
            Question:
            Find factorial of a number.

            Input:
            5

            Output:
            120
        */

        int num  = 5;
        int fact = 1;
        for (int i = num; i > 0 ; i--) {
            fact *= i;
        }
        System.out.printf("The factorial of %d: %d", num, fact);
    }
}
