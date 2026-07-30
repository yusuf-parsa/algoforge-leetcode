import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 39: Combination Sum
 * https://leetcode.com/problems/combination-sum/
 *
 * Time: Exponential in target
 * Space: O(target / minimum candidate) auxiliary
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(target, result, new ArrayList<>(), 0, candidates);
        return result;
    }

    private void backtrack(
            int target,
            List<List<Integer>> result,
            List<Integer> combination,
            int start,
            int[] candidates) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]);
            backtrack(target - candidates[i], result, combination, i, candidates);
            combination.remove(combination.size() - 1);
        }
    }
}
