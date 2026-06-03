package arrays.problems;

import java.util.HashMap;
import java.util.HashSet;

public class MaxFrequency {
    static  int getMode(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int maxFrequency = -1;
        int maxFrequencyKey = -1;

        for (int key : freq.keySet()){
            int currentKey = key;
            int currentKeyFrequency = freq.get(key);
            if (currentKeyFrequency > maxFrequency){
                maxFrequency = currentKeyFrequency;
                maxFrequencyKey = currentKey;
            }
        }
        return maxFrequencyKey;
    }

    public static void main(String[] args) {
        int[] array = {1,1,3,4,4,6,4,8,9};
        int occurs = getMode(array);
        System.out.println("Maximum frequency: "+occurs);
    }
}
