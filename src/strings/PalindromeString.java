package strings;

public class PalindromeString {
    public static void main(String[] args) {
        /*
    ("A palindrome reads same forward and backward.")
    Question:
    Check whether a string is palindrome or not.

    Input:
    madam

    Output:
    Palindrome
*/

        String originalStr = "madam";
        String reversedStr = "";

        for (int i=originalStr.length()-1; i>=0; i--){
            reversedStr += originalStr.charAt(i);
        }
        if (originalStr.equals(reversedStr)){
            System.out.printf("%s is a palindrome string", originalStr);
        }else {
            System.out.printf("%s is not a palindrome string" ,originalStr);
        }

    }

}
