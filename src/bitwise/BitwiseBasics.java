package bitwise;

public class BitwiseBasics {
    public static void main(String[] args) {
                /*
        Question:

        Create two integers:

        a = 5
        b = 3

        Print:

        a & b
        a | b
        a ^ b
        */

        int a = 5;
        int b = 3;

        System.out.printf("Bitwise AND: %d%n", a&b);
        System.out.printf("Bitwise OR: %d%n", a|b);
        System.out.printf("Bitwise NOR: %d%n", a^b);
    }
}
