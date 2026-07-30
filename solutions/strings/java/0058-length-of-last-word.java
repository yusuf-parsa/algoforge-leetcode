// Problem: https://leetcode.com/problems/length-of-last-word/
// Time: O(n)
// Space: O(n)

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];

        return lastWord.length();
    }
}
