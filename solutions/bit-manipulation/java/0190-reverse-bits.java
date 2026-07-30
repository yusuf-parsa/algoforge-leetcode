/**
 * LeetCode 190: Reverse Bits
 * https://leetcode.com/problems/reverse-bits/
 *
 * Time: O(1)
 * Space: O(1)
 */
class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int bit = 0; bit < 32; bit++) {
            result <<= 1;
            result |= n & 1;
            n >>>= 1;
        }

        return result;
    }
}
