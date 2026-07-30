/**
 * LeetCode 1143: Longest Common Subsequence
 * https://leetcode.com/problems/longest-common-subsequence/
 *
 * Time: O(m * n)
 * Space: O(m * n)
 */
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int rows = text1.length();
        int columns = text2.length();
        int[][] longest = new int[rows + 1][columns + 1];

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                if (text1.charAt(row - 1)
                        == text2.charAt(column - 1)) {
                    longest[row][column] =
                        longest[row - 1][column - 1] + 1;
                } else {
                    longest[row][column] = Math.max(
                        longest[row - 1][column],
                        longest[row][column - 1]
                    );
                }
            }
        }

        return longest[rows][columns];
    }
}
