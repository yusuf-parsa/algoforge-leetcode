/**
 * LeetCode 76: Minimum Window Substring
 * https://leetcode.com/problems/minimum-window-substring/
 *
 * Time: O(|s| + |t|)
 * Space: O(1) for the fixed character set
 */
class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        int[] required = new int[128];

        for (char character : t.toCharArray()) {
            required[character]++;
        }

        char[] characters = s.toCharArray();
        int left = 0;
        int matched = 0;
        int bestLength = Integer.MAX_VALUE;
        int bestStart = 0;

        for (int right = 0; right < characters.length; right++) {
            char added = characters[right];
            required[added]--;

            if (required[added] >= 0) {
                matched++;
            }

            while (matched == t.length()) {
                int windowLength = right - left + 1;

                if (windowLength < bestLength) {
                    bestLength = windowLength;
                    bestStart = left;
                }

                char removed = characters[left++];
                required[removed]++;

                if (required[removed] > 0) {
                    matched--;
                }
            }
        }

        if (bestLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(bestStart, bestStart + bestLength);
    }
}
