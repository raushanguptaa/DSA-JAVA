package patterns;

public class Rhombus {
    public static void main(String[] args) {
                /*
                Rhombus Pattern

                        * * * * *
                      * * * * *
                    * * * * *
                  * * * * *
                * * * * *

                */

        int n = 5; //number of rows
        for (int i = 1; i<=n; i++){
            //for each row ->  spaces then stars

            //spaces
            for (int j = 1; j<=n-i; j++){
                System.out.print("  "); //two spaces
            }
            //stars
            for (int k = 1; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
