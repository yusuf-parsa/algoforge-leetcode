/**
 * LeetCode 345: Reverse Vowels of a String
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 *
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public String reverseVowels(String s) {
        char[] characters = s.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(characters[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(characters[right]) == -1) {
                right--;
            }

            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}
