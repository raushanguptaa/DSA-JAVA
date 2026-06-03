package arrays.problems;

import java.util.HashMap;

public class MinMaxFrequency {
    static  int[] getMinMaxFrequencyElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        int hightestfreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > hightestfreq){
                hightestfreq = currentFreq;
                highestNum = currentKey;
            }
        }

        int lowestfreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestfreq){
                lowestfreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        return new int[]{highestNum, lowestNum};
    }

    public static void main(String[] args) {
        int[] array = {1,1,3,4,4,6,4,8,9};
        int[] newArray = getMinMaxFrequencyElement(array);
        System.out.println("Hightest Frequency Element: "+ newArray[0]);
        System.out.println("Lowest Frequency Element: "+ newArray[1]);
    }
}
