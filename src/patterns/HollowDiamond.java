package patterns;

public class HollowDiamond {
    public static void main(String[] args) {


            /*
            Hollow Diamond Pattern

                  *
                *   *
              *       *
            *           *
              *       *
                *   *
                  *

                */

        int n = 4;
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            if (i == 1){
                for (int k = 1; k<=i; k++){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");

                for (int l=1; l<=2*i-3; l++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i<=(n-1); i++){
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
           if (i == (n-1)){
               System.out.print("* ");
           }
           else {
               System.out.print("* ");
               for (int k=1; k<=2*(n-i)-3; k++){
                   System.out.print("  ");
               }
               System.out.print("* ");
           }
            System.out.println();
        }

    }
}
