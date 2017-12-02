/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. 
You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

cases
1, 2 -> -1 + 2 = 1
2, 1 -> -2 + 1 = -1 
7, 4, 10 -> -4 + 10 = 6
3, 1, 9, 0, 10 -> 18
*/

class Solution {
    public int maxProfit(int[] prices) {

        //base case:
        int n = prices.length;
        if (n == 0 || n == 1) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}