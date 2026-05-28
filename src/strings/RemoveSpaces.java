package strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        /*
        Question:
        Remove all spaces from a string.

        Input:
        Hello World Java

        Output:
        HelloWorldJava
    */
        String str = "Hello World Java";
        String removedSpace = str.replace(" ", "");
        System.out.printf("Removed spaces: %s", removedSpace);
    }
}
