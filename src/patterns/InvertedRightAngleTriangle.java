package patterns;

public class InvertedRightAngleTriangle {
    public static void main(String[] args) {

                /*
                Inverted Right Angle Triangle

                * * * * *
                * * * *
                * * *
                * *
                *

                */

        int n = 5;
        for (int i = 1; i <=n; i++ ){
            for (int j= 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
