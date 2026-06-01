package bitwise;

public class OddEvenCheck {
    public static void main(String[] args) {
        /*
    Question:

    Create an integer:

    num = 7

    Check whether the number is
    Odd or Even using Bitwise AND (&).

    Output:

    7 is Odd
*/
        int num = 7;

        if ((num & 1) == 1){
            System.out.printf("%d is odd", num);
        }else {
            System.out.printf("%d is Even", num);
        }
    }
}
