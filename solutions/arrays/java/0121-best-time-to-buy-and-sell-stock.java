/**
 * LeetCode 121: Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (buyPrice < price) {
                int profit = price - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price;
            }
        }

        return maxProfit;
    }
}
