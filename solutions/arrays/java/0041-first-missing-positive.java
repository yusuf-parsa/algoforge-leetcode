/**
 * LeetCode 41: First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean containsOne = false;

        for (int num : nums) {
            if (num == 1) {
                containsOne = true;
                break;
            }
        }

        if (!containsOne) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int value = Math.abs(nums[i]);

            if (value == n) {
                nums[0] = -Math.abs(nums[0]);
            } else {
                nums[value] = -Math.abs(nums[value]);
            }
        }

        for (int value = 1; value < n; value++) {
            if (nums[value] > 0) {
                return value;
            }
        }

        if (nums[0] > 0) {
            return n;
        }

        return n + 1;
    }
}
