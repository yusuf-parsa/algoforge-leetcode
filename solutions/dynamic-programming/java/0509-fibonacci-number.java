/**
 * LeetCode 509: Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 *
 * Time: O(2^n)
 * Space: O(n)
 */
class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int previous = fib(n - 1);
        int beforePrevious = fib(n - 2);
        return previous + beforePrevious;
    }
}
