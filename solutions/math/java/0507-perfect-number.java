/**
 * LeetCode 507: Perfect Number
 * https://leetcode.com/problems/perfect-number/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 0;
        int divisor = num / 2;

        while (divisor > 0) {
            if (num % divisor == 0) {
                sum += divisor;
            }
            divisor--;
        }

        return sum == num;
    }
}
