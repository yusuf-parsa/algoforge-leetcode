import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode 15: 3Sum
 * https://leetcode.com/problems/3sum/
 *
 * Time: O(n^2)
 * Space: O(r), where r is the number of unique triplets
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
