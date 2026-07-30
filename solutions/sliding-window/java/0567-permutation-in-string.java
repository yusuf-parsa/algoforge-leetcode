/**
 * LeetCode 567: Permutation in String
 * https://leetcode.com/problems/permutation-in-string/
 *
 * Time: O(|s1| + |s2|)
 * Space: O(1)
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] firstCounts = new int[26];
        int[] windowCounts = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            firstCounts[s1.charAt(i) - 'a']++;
            windowCounts[s2.charAt(i) - 'a']++;
        }

        for (int left = 0; left < s2.length() - s1.length(); left++) {
            if (sameCounts(firstCounts, windowCounts)) {
                return true;
            }

            windowCounts[s2.charAt(left + s1.length()) - 'a']++;
            windowCounts[s2.charAt(left) - 'a']--;
        }

        return sameCounts(firstCounts, windowCounts);
    }

    private boolean sameCounts(int[] first, int[] second) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }
}
