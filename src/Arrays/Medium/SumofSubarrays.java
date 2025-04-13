package Arrays.Medium;

public class SumofSubarrays {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
       int[] arr = {1, 2, 3};
        System.out.println(sumOfSubarrays(arr, 0, 0));
    }

    public static long sumOfSubarrays(int[] arr, int start, int end) {
        if (start == arr.length) return 0; // Base case: All subarrays considered
        if (end == arr.length) return sumOfSubarrays(arr, start + 1, start + 1); // Move to the next start index

        // Compute the sum of the current subarray
        long currSum = 0;
        for (int i = start; i <= end; i++) {
            currSum = (currSum + arr[i]) % MOD;
        }

        // Recurse for the next subarray starting from the same index
        return (currSum + sumOfSubarrays(arr, start, end + 1)) % MOD;
    }
}
