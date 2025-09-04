class PartitionASet {
    static boolean isSubsetSum(int n, int[] arr, int sum) {
        if (sum == 0) 
            return true;
        if (n == 0) 
            return false;
        if (arr[n - 1] > sum) 
            return isSubsetSum(n - 1, arr, sum);
        return isSubsetSum(n - 1, arr, sum) || 
               isSubsetSum(n - 1, arr, sum - arr[n - 1]);
    }
    static boolean equalPartition(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) 
            return false;
        return isSubsetSum(arr.length, arr, sum / 2);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 11, 5 };
        if (equalPartition(arr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}