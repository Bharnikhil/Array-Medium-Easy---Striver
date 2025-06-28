package StriverArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_ii {
    public static void main(String[] args) {
        // when you want to return the indices of these two elements then you have to use a map data structure because for implementing two pointer approach you need to sort
        // and after sorting the array how will you find the correct inidex of the 2 elements in the orginal array
        int n = 5;
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {-1, -1}; // If no solution is found

    }
}
