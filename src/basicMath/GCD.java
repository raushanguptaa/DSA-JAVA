package basicMath;

public class GCD {
    public static void main(String[] args) {
        /*
            Question:
            Find the GCD (Greatest Common Divisor)
            of two numbers.

            Input:
            12, 18

            Output:
            6
        */

        int a = 12;
        int b = 18;

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.printf("GCD: %d",a);
    }
}
