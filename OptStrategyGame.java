
import java.util.*;
class OptStrategyGame { 
    static int maxAmount(int i, int j, int[] arr) {
        if (i > j)
            return 0;
        int takeFirst
            = arr[i]
              + Math.min(maxAmount(i + 2, j, arr),
                         maxAmount(i + 1, j - 1, arr));
        int takeLast   = arr[j]
              + Math.min(maxAmount(i + 1, j - 1, arr),
                         maxAmount(i, j - 2, arr));
        return Math.max(takeFirst, takeLast);
    }
    static int maximumAmount(int[] arr) {
      	int n = arr.length;
        int res = maxAmount(0, n - 1, arr);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 10 };
        int res = maximumAmount(arr);
        System.out.println(res);
    }
}