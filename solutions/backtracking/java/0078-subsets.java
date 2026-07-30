import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 78: Subsets
 * https://leetcode.com/problems/subsets/
 *
 * Time: O(n * 2^n)
 * Space: O(n * 2^n) including the output
 */
class Solution {
    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums, 0, new ArrayList<>());
        return result;
    }

    private void findSubsets(
            int[] nums,
            int index,
            List<Integer> subset) {
        if (index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        findSubsets(nums, index + 1, subset);
        subset.remove(subset.size() - 1);

        findSubsets(nums, index + 1, subset);
    }
}
