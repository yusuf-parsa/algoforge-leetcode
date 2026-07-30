/**
 * LeetCode 392: Is Subsequence
 * https://leetcode.com/problems/is-subsequence/
 *
 * Time: O(|t|)
 * Space: O(1)
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sourceIndex = 0;
        int targetIndex = 0;

        while (sourceIndex < s.length() && targetIndex < t.length()) {
            if (s.charAt(sourceIndex) == t.charAt(targetIndex)) {
                sourceIndex++;
            }
            targetIndex++;
        }

        return sourceIndex == s.length();
    }
}
