package bitwise;

public class UniqueElementDemo {
    public static void main(String[] args) {
        /*
    Question:

    Given:

    int[] numbers = {2, 3, 2, 4, 4};

    Every number appears twice
    except one number.

    Find the unique number
    using XOR (^).

    Output:

    Unique Number: 3
*/
        int[] numbers = {2, 3, 2, 4, 4};
        int result = 0;

        for (int num  : numbers){
            result ^= num;
        }

        System.out.printf("Unique Number: %d", result);

    }
}
