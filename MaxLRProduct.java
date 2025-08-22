// Java program to find the maximum LR product 
// using a single stack
import java.util.*;

class  MaxLRProduct {

    static int findMaxLRProduct(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        Stack<Integer> stk = new Stack<>();
        int maxProduct = 0;

        // Compute left(i) and right(i) using a single stack
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] <= arr[i]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                left[i] = stk.peek() + 1;
            }
            stk.push(i);
        }
        stk.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[stk.peek()] <= arr[i]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                maxProduct = Math.max(maxProduct, left[i] * (stk.peek() + 1));
            }
            stk.push(i);
        }
        return maxProduct;
    }
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 0, 1, 1, 1, 1, 1};

        System.out.println(findMaxLRProduct(arr));
    }
}