package basicMath;

public class FibonacciSeries {
    public static void main(String[] args) {

        /*
            Question:
            Print Fibonacci series up to n terms.

            Input:
            7

            Output:
            0 1 1 2 3 5 8
        */

        int n = 7;

        int a = 0;
        int b = 1;

        System.out.print(a+ " "+ b+" ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next+" ");
            a = b;
            b = next;
        }
    }
}
