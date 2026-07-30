/**
 * LeetCode 242: Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // The problem input contains lowercase English letters only.
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
