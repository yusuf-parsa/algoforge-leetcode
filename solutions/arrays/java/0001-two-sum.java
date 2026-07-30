import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1: Two Sum
 * https://leetcode.com/problems/two-sum/
 *
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check whether the needed number is already in the map.
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // Store the current number and its index.
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
