package StriverArrays;

import java.util.HashSet;

public class LongestConsSequence {
    public static void main(String[] args) {
        // 🔽 Given array (hardcoded)
        int[] arr = {100, 4, 200, 1, 3, 2};

        // ✅ Call function and print result
        int result = longestConsecutive(arr);
        System.out.println("Length of the longest consecutive subsequence: " + result);

    }
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        // Add all elements to a HashSet for O(1) lookups.
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Iterate over each number in the set.
        for (int num : set) {
            // Only start counting if 'num' is the beginning of a sequence.
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers.
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}
