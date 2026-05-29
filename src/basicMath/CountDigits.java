package basicMath;

public class CountDigits {
    public static void main(String[] args) {

        /*
        Question:
        Count total digits in a number.

        Input:
        12345

        Output:
        Total Digits: 5
    */
        int num = 12345;
        int count = 0;

        while (num > 0){
            count++;
            num = num / 10;
        }
        System.out.print("Total Digits: "+ count);

    }
}
