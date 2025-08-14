import java.util.Arrays;

public class NearestSmaller{
    public static void prevSmaller(int[] arr) {
        // Always print -1 for the first element
        System.out.print("-1 ");

        // Start from second element
        for (int i = 1; i < arr.length; i++) {
            int j;

            // Look for a smaller element on the left of 'i'
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }

            // If there is no smaller element on left of 'i', print -1
            if (j == -1)
                System.out.print("-1 ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 4, 5};
        prevSmaller(arr);
    }
}