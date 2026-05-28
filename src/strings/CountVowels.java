package strings;

public class CountVowels {
    public static void main(String[] args) {
        /*
        Question:
        Count total vowels in a string.

        Input:
        education

        Output:
        Total Vowels: 5
    */

        String word = "education";
        int vowelCount = 0;

        for (int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if (ch == 'a' || ch ==  'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U' ){
                vowelCount++;
            }
        }
        System.out.printf("Total Vowels: %d", vowelCount);
    }
}
