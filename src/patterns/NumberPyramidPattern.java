package patterns;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        /*
            Number Pyramid Pattern

                    1
                  2 2 2
                3 3 3 3 3
              4 4 4 4 4 4 4
            5 5 5 5 5 5 5 5 5

            */

        int n=5;
        for (int i=1; i<=n; i++){
            //space
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for (int k=1; k<=2*i-1; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
