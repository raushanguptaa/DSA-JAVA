package basicMath;

public class PrimeNumber {
    public static void main(String[] args) {

        /*
            Question:
            Check whether a number is prime or not.

            Input:
            7

            Output:
            Prime Number
        */

        int num = 7;
        boolean isPrime =true;

        if (num <= 1){
            isPrime = false;
        }else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.printf("%d is a prime number.", num);
        }else{
            System.out.printf("%d is not a prime number.", num);
        }

    }
}
