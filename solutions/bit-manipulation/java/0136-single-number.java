/**
 * LeetCode 136: Single Number
 * https://leetcode.com/problems/single-number/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
