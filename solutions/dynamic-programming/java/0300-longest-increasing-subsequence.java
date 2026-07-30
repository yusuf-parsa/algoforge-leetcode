import java.util.Arrays;

/**
 * LeetCode 300: Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 *
 * Time: O(n^2)
 * Space: O(n)
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] longestEndingAt = new int[nums.length];
        Arrays.fill(longestEndingAt, 1);
        int maximumLength = 1;

        for (int current = 1; current < nums.length; current++) {
            for (int previous = 0; previous < current; previous++) {
                if (nums[previous] < nums[current]) {
                    longestEndingAt[current] = Math.max(
                        longestEndingAt[current],
                        longestEndingAt[previous] + 1
                    );
                }
            }

            maximumLength = Math.max(
                maximumLength,
                longestEndingAt[current]
            );
        }

        return maximumLength;
    }
}
