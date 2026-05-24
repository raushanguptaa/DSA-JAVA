package patterns;

public class SolidDiamond {
    public static void main(String[] args) {
        /*
            Diamond Pattern

                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *

*/

        int n=4;
        //for upper part
        for (int i = 1; i<=n; i++){
            //space
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //for bottom part
        for (int i = 1; i <=n; i++){
            // to remove the first row
            if (i == 1){
                continue;
            }

            for (int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*n-2*i+1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
