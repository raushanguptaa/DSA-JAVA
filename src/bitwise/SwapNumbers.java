package bitwise;

public class SwapNumbers {
    public static void main(String[] args) {
        /*
    Question:

    Create:

    a = 10
    b = 20

    Swap the numbers using XOR (^).

    Do NOT use:

    temp variable

    Output:

    Before Swap:
    a = 10
    b = 20

    After Swap:
    a = 20
    b = 10
*/

        int a = 10;
        int b = 20;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.printf("a = %d, b = %d%n", a, b);
    }
}
