/**
 * LeetCode 70: Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 *
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;

        for (int step = 3; step <= n; step++) {
            ways[step] = ways[step - 1] + ways[step - 2];
        }

        return ways[n];
    }
}
