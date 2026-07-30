// Problem: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Time: O(n * m) worst case
// Space: O(1)

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
