package strings;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Question : Reverse a string

        Input:
        hello

        Output:
        olleh

        */


        String str = "hello";
        System.out.print("Reversed String: ");
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
