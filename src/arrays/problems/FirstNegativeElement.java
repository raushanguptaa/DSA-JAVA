package arrays.problems;

public class FirstNegativeElement {
//    Return the first negative number from the array.
    static int getFirstNegativeELement(int[] arr){

        for (int num : arr){
            if (num < 0){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, -2, -7, 10};
        System.out.printf("First Negative Element: %d",getFirstNegativeELement(array));
    }
}
