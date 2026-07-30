import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 46: Permutations
 * https://leetcode.com/problems/permutations/
 *
 * Time: O(n * n!)
 * Space: O(n) auxiliary, excluding the output
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        buildPermutations(nums, 0, result);
        return result;
    }

    private void buildPermutations(
            int[] nums,
            int index,
            List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();

            for (int num : nums) {
                permutation.add(num);
            }

            result.add(permutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            buildPermutations(nums, index + 1, result);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int first, int second) {
        int temporary = nums[first];
        nums[first] = nums[second];
        nums[second] = temporary;
    }
}
