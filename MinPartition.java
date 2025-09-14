
import java.util.*;

class MinPartition{
    static int findMinDifference(ArrayList<Integer> arr, int n,int sumCalculated, int sumTotal) {
        if (n == 0) {
            return Math.abs((sumTotal - sumCalculated) 
                                        - sumCalculated);
        }
        int include = findMinDifference(arr, n - 1,sumCalculated + arr.get(n - 1), sumTotal);
        int exclude = findMinDifference(arr,n - 1, sumCalculated, sumTotal);
        return Math.min(include, exclude);
    }
    static int minDifference(ArrayList<Integer> arr) {
        int sumTotal = 0;
        for (int num : arr) {
            sumTotal += num;
        }
        return findMinDifference(arr,arr.size(), 0, sumTotal);
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 6, 11, 5));

        System.out.println(minDifference(arr));
    }
}