package patterns;

public class HourglassPattern {
    public static void main(String[] args) {
        /*
        Hourglass Pattern

        * * * * * * *
          * * * * *
            * * *
              *
            * * *
          * * * * *
        * * * * * * *

        */

        int n =5;

        //inverted Pyramid
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*n-2*i+1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //pyramid
        for (int i = 1; i <= n; i++){
            if (i==1){
                continue;
            }
            //space
            for (int j=1; j <=n-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
