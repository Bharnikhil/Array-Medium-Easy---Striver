package StriverArrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // when you just want to return true or false;
        // two pointer approach
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        boolean ans = twoSum(arr, target);
        System.out.println(ans);


    }
    static boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) left++;
            else right--;
        }
        return false;
    }
}
