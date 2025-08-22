import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class GreaterFrequency {
    public static ArrayList<Integer> findGreater(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (freq.get(arr[j]) > freq.get(arr[i])) {
                    result.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 2, 1};
        ArrayList<Integer> result = findGreater(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}