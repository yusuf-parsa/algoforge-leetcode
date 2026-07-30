/**
 * LeetCode 5: Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Time: O(n^2)
 * Space: O(1)
 */
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int startIndex = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIndex = left;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIndex = left;
                }
                left--;
                right++;
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }
}
