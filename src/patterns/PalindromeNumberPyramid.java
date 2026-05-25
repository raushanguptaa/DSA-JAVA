package patterns;

public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        /*
        Palindrome Number Pyramid Pattern

                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1

        */
        int n = 5;
        for (int i =1; i<=n; i++){
            // for spaces
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // for-> leftAngleTriangle
            for (int k=1; k<=i; k++){
                System.out.print(k+" ");
            }

            int count = i-1;
            for (int l=1; l<=i-1; l++){
                System.out.print(count+" ");
                count--;
            }

            System.out.println();
        }
    }
}
