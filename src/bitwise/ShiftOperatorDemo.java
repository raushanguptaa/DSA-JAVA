package bitwise;

public class ShiftOperatorDemo {
    public static void main(String[] args) {
        /*
Question:

Create:

num = 5

Print:

num << 1
num << 2

Create:

num2 = 16

Print:

num2 >> 1
num2 >> 2

Expected Output:

10
20
8
4
*/

        int num = 5;
        int num2 = 16;

        //num
        System.out.printf("Left shift by one: %d%n", num << 1);
        System.out.printf("Left shift by two: %d%n", num << 2);

        //num2
        System.out.printf("Right shift by one: %d%n", num2 >> 1);
        System.out.printf("Right shift by two: %d%n", num2 >> 2);
    }
}
