/**
 * LeetCode 647: Palindromic Substrings
 * https://leetcode.com/problems/palindromic-substrings/
 *
 * Time: O(n^2)
 * Space: O(n^2)
 */
class Solution {
    public int countSubstrings(String s) {
        int length = s.length();
        Boolean[][] memo = new Boolean[length][length];
        int count = 0;

        for (int start = 0; start < length; start++) {
            for (int end = start; end < length; end++) {
                if (isPalindrome(s, start, end, memo)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isPalindrome(
            String s,
            int start,
            int end,
            Boolean[][] memo) {
        if (start >= end) {
            return true;
        }

        if (memo[start][end] != null) {
            return memo[start][end];
        }

        if (s.charAt(start) != s.charAt(end)) {
            memo[start][end] = false;
            return false;
        }

        memo[start][end] =
            isPalindrome(s, start + 1, end - 1, memo);

        return memo[start][end];
    }
}
