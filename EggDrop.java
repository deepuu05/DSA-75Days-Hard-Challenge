
import java.util.*;

class EggDrop {

   
    static int eggDrop(int n, int k) {

        // if there is less than or equal to one floor
        if (k == 1 || k == 0)
            return k;

        // if there is only one egg
        if (n == 1)
            return k;

        // to store the minimum number of attempts
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            int cur = 1 + Math.max(eggDrop(n - 1, i - 1), eggDrop(n, k - i));
            if (cur < res)
                res = cur;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 2, k = 10;
        System.out.println(eggDrop(n, k));
    }
}