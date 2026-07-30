import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 17: Letter Combinations of a Phone Number
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 * Time: O(4^n * n)
 * Space: O(4^n * n) including the output
 */
class Solution {
    private final String[] map = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        backtrack(combinations, digits, "", 0);
        return combinations;
    }

    private void backtrack(
            List<String> combinations,
            String digits,
            String currentCombination,
            int index) {
        if (index == digits.length()) {
            combinations.add(currentCombination);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char letter : letters.toCharArray()) {
            backtrack(
                combinations,
                digits,
                currentCombination + letter,
                index + 1
            );
        }
    }
}
