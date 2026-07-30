/**
 * LeetCode 202: Happy Number
 * https://leetcode.com/problems/happy-number/
 *
 * Time: O(log n)
 * Space: O(1)
 */
class Solution {
    public boolean isHappy(int n) {
        int result = n;

        while (result != 1 && result != 4) {
            int current = result;
            result = 0;

            while (current > 0) {
                int lastDigit = current % 10;
                result += lastDigit * lastDigit;
                current /= 10;
            }
        }

        return result == 1;
    }
}
