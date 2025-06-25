package StriverArrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumPosNeg {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3, -2, 4};
        int k = 3;

        int result = getLongestSubarray(arr, k);
        System.out.println("Longest subarray length with sum " + k + " = " + result);
    }

    public static int getLongestSubarray(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            int rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i); // store the earliest occurrence
            }
        }

        return maxLen;
    }
}
