import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 22: Generate Parentheses
 * https://leetcode.com/problems/generate-parentheses/
 *
 * Time: O(4^n / sqrt(n))
 * Space: O(n) auxiliary
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        generate(output, "", 0, 0, n);
        return output;
    }

    private void generate(List<String> output, String current,
                          int openCount, int closeCount, int max) {
        if (current.length() == max * 2) {
            output.add(current);
            return;
        }

        if (openCount < max) {
            generate(output, current + "(", openCount + 1, closeCount, max);
        }

        if (closeCount < openCount) {
            generate(output, current + ")", openCount, closeCount + 1, max);
        }
    }
}
