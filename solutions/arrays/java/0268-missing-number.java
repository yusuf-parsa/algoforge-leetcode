import java.util.Arrays;

/**
 * LeetCode 268: Missing Number
 * https://leetcode.com/problems/missing-number/
 *
 * Time: O(n log n)
 * Space: O(log n)
 */
class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int expected = nums[i] + 1;

            if (expected != nums[i + 1]) {
                return expected;
            }
        }

        return nums[nums.length - 1] + 1;
    }
}
