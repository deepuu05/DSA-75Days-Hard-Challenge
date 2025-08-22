import java.util.Arrays;

public class Diff {
    public static int findMaxDiff(int[] arr)
    {
        int n = arr.length;
        int res = 0;

    
        for (int i = 0; i < n; ++i) {
            int leftSmaller = 0, rightSmaller = 0;
            for (int j = i - 1; j >= 0; --j) {
                if (arr[j] < arr[i]) {
                    leftSmaller = arr[j];
                    break;
                }
            }
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[i]) {
                    rightSmaller = arr[j];
                    break;
                }
            }
            int diff = Math.abs(leftSmaller - rightSmaller);   
            res = Math.max(res, diff);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = { 2, 1, 8 };
        System.out.println(findMaxDiff(arr));
    }
}