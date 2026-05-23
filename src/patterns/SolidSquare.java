package patterns;

public class SolidSquare {
    public static void main(String[] args) {

         /*
        4 x 4 Solid Square

        * * * *
        * * * *
        * * * *
        * * * *


        */

        int n =4;
        for (int i = 1; i <=n ; i++) {
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
