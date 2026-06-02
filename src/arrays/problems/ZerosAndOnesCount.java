package arrays.problems;

public class ZerosAndOnesCount {
    static int[] getZerosOnes(int[] arr){
        int Zeros = 0;
        int Ones = 0;

        for (int num: arr){
            if (num == 0){
                Zeros++;
            }else {
                Ones++;
            }
        }
        return new int[]{Zeros, Ones};
    }

    public static void main(String[] args) {
        int[] array = {1,1,1,0,1,0,0,0,1,1,0,1,0,1,1};
        int[] count = getZerosOnes(array);
        System.out.printf("Zeros: %d%nOnes: %d%n",count[0], count[1]);
    }
}
