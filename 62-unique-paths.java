/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. 
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Note: m and n will be at most 100.
*/

/*** DP bottom-up approach */

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for (int r = 0; r < m; r++){
            dp[r][0] = 1;
        }
        
        for (int c = 0; c < n; c++){
            dp[0][c] = 1;
        }
        
        for (int r = 1; r < m; r++){
            for (int c = 1; c < n; c++){
                dp[r][c] = dp[r-1][c] + dp[r][c-1];
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[m-1][n-1];
    }
}


