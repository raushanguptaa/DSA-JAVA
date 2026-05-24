package patterns;

public class HollowRectangle {
    public static void main(String[] args) {

        /*

        Hollow Rectangle Star Pattern

         * * * * * *
         *         *
         *         *
         * * * * * *

         */

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    //middle rows
                    if (j == 1) {
                        System.out.print("* ");
                    } else if (j == 6) {
                        System.out.print("* ");
                    } else {
                        // middle space
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
