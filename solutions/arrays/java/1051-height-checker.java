import java.util.Arrays;

/**
 * LeetCode 1051: Height Checker
 * https://leetcode.com/problems/height-checker/
 *
 * Time: O(n log n)
 * Space: O(n)
 */
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        int differences = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                differences++;
            }
        }

        return differences;
    }
}
