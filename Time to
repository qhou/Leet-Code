/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
*/

class Solution {
    public int maxProfit(int[] prices) {
        //brute force: check difference between all pairs and return max, in O(n^2)
        //better approach: maintain pointers to max, imax and min, imin
        //base cases
        int n = prices.length;
        System.out.println(n);
        if (n == 0 || n == 1) return 0; 
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        
        //input: 7, 3, 6, 1, 3
        //output: 3
        //i+1 is either > min, or < min 
        for (int i = 0; i < n; i++){
            System.out.print(prices[i]);
            if (prices[i] < min){
                min = prices[i];
        } else //prices[i+1] > min
            if ((prices[i] - min) > maxProfit){
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}