package arrays.problems;

public class PositiveNegativeSum {
    static int[] getPositiveNegativeSum(int[] arr){
        int Positive = 0;
        int Negative = 0;

        for (int num: arr) {
            if (num > 0){
                Positive += num;
            }else {
                Negative += num;
            }
        }
        return new int[]{Positive, Negative};
    }

    public static void main(String[] args) {
        int[] array = {1,-2,-3,4,-5,6,7,-8,9};
        int[] ans = getPositiveNegativeSum(array);
        System.out.printf("Postive: %d%nNegative: %d%n", ans[0], ans[1]);

    }
}
