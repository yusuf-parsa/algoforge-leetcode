/**
 * LeetCode 424: Longest Repeating Character Replacement
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurrences = new int[26];
        int left = 0;
        int longest = 0;
        int maxOccurrence = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            occurrences[index]++;
            maxOccurrence = Math.max(maxOccurrence, occurrences[index]);

            if (right - left + 1 - maxOccurrence > k) {
                occurrences[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
