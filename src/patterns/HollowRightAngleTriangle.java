package patterns;

public class HollowRightAngleTriangle {
    public static void main(String[] args) {
        /*

        Hollow Right Angle Triangle

            *
            * *
            *   *
            *     *
            * * * * *

         */

        int n = 5;
        for (int i = 1; i<=n; i++){
            if (i == 1 || i == 2 || i == n){
                for (int j=1; j<=i; j++){
                    System.out.print("* ");
                }
            }else{
                //one star on left side
                System.out.print("* ");

                //middle spaces
                for (int k=1; k<=(i-2); k++){
                    System.out.print("  ");
                }

                //one star on right side
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
