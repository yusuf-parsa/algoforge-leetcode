/**
 * LeetCode 387: First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int firstUniqChar(String s) {
        int[] frequency = new int[26];

        for (int index = 0; index < s.length(); index++) {
            frequency[s.charAt(index) - 'a']++;
        }

        for (int index = 0; index < s.length(); index++) {
            if (frequency[s.charAt(index) - 'a'] == 1) {
                return index;
            }
        }

        return -1;
    }
}
