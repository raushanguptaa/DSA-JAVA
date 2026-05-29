package basicMath;

public class LCM {
    public static void main(String[] args) {

        /*
            Question:
            Find the LCM (The Least Common Multiple)
            of two numbers.

            Input:
            12, 18

            Output:
            36

        */

        int a = 12;
        int b = 18;

        int x = a;
        int y = b;

        while (y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }

        //LCM(a,b) = a.b/GCD(a,b)
        int gcd = x;
        int lcm = (a * b)/gcd;

        System.out.print("LCM: "+lcm);




    }
}
