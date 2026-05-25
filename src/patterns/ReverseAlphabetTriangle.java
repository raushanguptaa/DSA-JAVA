package patterns;

public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        /*
        Reverse Alphabet Triangle

        E
        E D
        E D C
        E D C B
        E D C B A

        */

        int n=5;
        for (int i = 1; i<=n; i++){
            char ch = 'E';
            for (int j = 1; j<=i; j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
