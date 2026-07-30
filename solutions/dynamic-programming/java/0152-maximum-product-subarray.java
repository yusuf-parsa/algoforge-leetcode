/**
 * LeetCode 152: Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int maxProduct(int[] nums) {
        int maximum = nums[0];
        int minimum = nums[0];
        int result = nums[0];

        for (int index = 1; index < nums.length; index++) {
            if (nums[index] < 0) {
                int temporary = maximum;
                maximum = minimum;
                minimum = temporary;
            }

            maximum = Math.max(nums[index], maximum * nums[index]);
            minimum = Math.min(nums[index], minimum * nums[index]);
            result = Math.max(result, maximum);
        }

        return result;
    }
}
