package strings;

public class ToggleCase {
    public static void main(String[] args) {
        /*
        Question:
        Convert uppercase letters to lowercase
        and lowercase letters to uppercase.

        Input:
        HeLLo

        Output:
        hEllO
    */

        String str = "HeLLo";
        String changedStr = "";


        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' ){
                changedStr += (char)(ch+32);
            } else if (ch >= 'a' && ch <= 'z') {
                changedStr += (char)(ch-32);
            }
        }
        System.out.printf("Before: %s\nAfter: %s",str, changedStr);
    }
}
