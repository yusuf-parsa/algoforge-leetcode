/**
 * LeetCode 405: Convert a Number to Hexadecimal
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 *
 * Time: O(1)
 * Space: O(1)
 */
class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] hexDigits = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        StringBuilder hexadecimal = new StringBuilder();

        while (num != 0) {
            int lastFourBits = num & 15;
            hexadecimal.append(hexDigits[lastFourBits]);
            num >>>= 4;
        }

        return hexadecimal.reverse().toString();
    }
}
