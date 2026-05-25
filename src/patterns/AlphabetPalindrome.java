package patterns;

public class AlphabetPalindrome {
    public static void main(String[] args) {
        /*
        Alphabet Palindrome Pyramid

                A
              A B A
            A B C B A
          A B C D C B A
        A B C D E D C B A

        */
        int n=5;
        for (int i = 1; i<=n; i++){
            char ch = 'A';
            //for-> spaces
            for (int j =1; j<=n-i; j++){
                System.out.print("  ");
            }

            for (int k =1; k<=i; k++){
                System.out.print(ch+" ");
                ch++;
            }

            ch -= 2;
            for (int l=1; l<=i-1; l++){
                System.out.print(ch+" ");
                ch--;
            }


            System.out.println();
        }
    }
}
