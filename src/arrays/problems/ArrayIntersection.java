package arrays.problems;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayIntersection {
    static ArrayList<Integer> getIntersectionElements(int[] array1, int[] array2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int num: array1){
            set.add(num);
        }
        for (int num : array2){
            if (set.contains(num)){
                intersection.add(num);
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {2,3,4};

        ArrayList<Integer> result = getIntersectionElements(array1, array2);

        System.out.print("Insersection Elements: ");
        for (int num: result){
            System.out.printf("%d ",num);
        }
    }
}
