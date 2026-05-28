package strings;

public class CountUpperLower {
    public static void main(String[] args) {
        /*
        Question:
        Count total uppercase and lowercase characters in a string.

        Input:
        HeLLo

        Output:
        Uppercase Count: 3
        Lowercase Count: 2
    */

        String str = "HeLLo";
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercaseCount++;
            }
        }
        System.out.printf("Uppercase Count: %d\nLowercase Count: %d", uppercaseCount, lowercaseCount);
    }
}
