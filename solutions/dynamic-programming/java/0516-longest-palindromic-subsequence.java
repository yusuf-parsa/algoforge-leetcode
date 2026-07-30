/**
 * LeetCode 516: Longest Palindromic Subsequence
 * https://leetcode.com/problems/longest-palindromic-subsequence/
 *
 * Time: O(n^2)
 * Space: O(n)
 */
class Solution {
    public int longestPalindromeSubseq(String s) {
        int length = s.length();
        int[] current = new int[length];
        int[] previous = new int[length];

        for (int left = length - 1; left >= 0; left--) {
            current[left] = 1;

            for (int right = left + 1; right < length; right++) {
                if (s.charAt(left) == s.charAt(right)) {
                    current[right] = previous[right - 1] + 2;
                } else {
                    current[right] = Math.max(
                        previous[right],
                        current[right - 1]
                    );
                }
            }

            int[] temporary = previous;
            previous = current;
            current = temporary;
        }

        return previous[length - 1];
    }
}
