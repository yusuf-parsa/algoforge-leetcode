/**
 * LeetCode 746: Min Cost Climbing Stairs
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 *
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minimumCost = new int[cost.length];
        minimumCost[0] = cost[0];
        minimumCost[1] = cost[1];

        for (int step = 2; step < cost.length; step++) {
            minimumCost[step] =
                Math.min(minimumCost[step - 1], minimumCost[step - 2])
                + cost[step];
        }

        return Math.min(
            minimumCost[cost.length - 1],
            minimumCost[cost.length - 2]
        );
    }
}
