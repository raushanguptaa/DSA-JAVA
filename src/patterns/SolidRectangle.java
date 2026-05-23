package patterns;

public class SolidRectangle {
    public static void main(String[] args) {

        /*
        3 x 5 Solid Rectangle

        * * * * *
        * * * * *
        * * * * *


        */

        int n = 3;

        for(int i = 1; i <=n; i++){
            for (int j = 1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
