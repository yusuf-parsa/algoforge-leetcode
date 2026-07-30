/**
 * LeetCode 122: Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;

        for (int day = 1; day < prices.length; day++) {
            if (prices[day] > prices[day - 1]) {
                maximumProfit += prices[day] - prices[day - 1];
            }
        }

        return maximumProfit;
    }
}
