// Problem: https://leetcode.com/problems/valid-palindrome/
// Time: O(n^2), due to repeated String concatenation
// Space: O(n)

class Solution {
    public boolean isPalindrome(String s) {
        String filtered = "";
        String reversed = "";

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                filtered += current;
            }
        }

        filtered = filtered.toLowerCase();

        for (int i = filtered.length() - 1; i >= 0; i--) {
            reversed += filtered.charAt(i);
        }

        return filtered.equals(reversed);
    }
}
