/**
 * LeetCode 309: Best Time to Buy and Sell Stock with Cooldown
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int hold = -prices[0];
        int sold = 0;
        int rest = 0;

        for (int day = 1; day < prices.length; day++) {
            int previousSold = sold;

            sold = hold + prices[day];
            hold = Math.max(hold, rest - prices[day]);
            rest = Math.max(rest, previousSold);
        }

        return Math.max(sold, rest);
    }
}
