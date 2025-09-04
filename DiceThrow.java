
import java.util.*;

class DiceThrow{

    static int noOfWays(int m, int n, int x) {
        if (n == 0 && x == 0) return 1;
        if (n == 0 || x <= 0) return 0;
        
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            ans += noOfWays(m, n - 1, x - i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int m = 6, n = 3, x = 8;
        System.out.println(noOfWays(m, n, x));
    }
}