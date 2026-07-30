/**
 * LeetCode 198: House Robber
 * https://leetcode.com/problems/house-robber/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int rob(int[] nums) {
        int length = nums.length;

        if (length == 0) {
            return 0;
        }

        if (length <= 2) {
            return Math.max(nums[0], nums[length - 1]);
        }

        int twoHousesBack = nums[0];
        int oneHouseBack = Math.max(nums[0], nums[1]);

        for (int index = 2; index < length; index++) {
            int current = Math.max(
                oneHouseBack,
                twoHousesBack + nums[index]
            );

            twoHousesBack = oneHouseBack;
            oneHouseBack = current;
        }

        return oneHouseBack;
    }
}
