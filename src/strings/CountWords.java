package strings;

public class CountWords {
    public static void main(String[] args) {
        /*
        Question:
        Count total words in a string.

        Input:
        Java is fun

        Output:
        Total Words: 3
    */

        String str = "Java is fun";
        String[] words = str.trim().split("\\s+");
        System.out.printf("Total Words: %d", words.length );
    }
}
