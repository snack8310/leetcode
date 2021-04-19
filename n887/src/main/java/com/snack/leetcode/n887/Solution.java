package com.snack.leetcode.n887;

public class Solution {
    public int superEggDrop(int k, int n) {
        int[][] dp = new int[k + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[0][i] = 0;
            dp[1][i] = i;
        }
        for (int i = 1; i <= k; i++) {
            dp[i][0] = 0;
        }
        for (int i = 2; i <= k; i++) {    // 从两个蛋开始
            for (int j = 1; j <= n; j++) {
                int ret = n * n;
                for (int x = 1; x <= j; x++) {   //扔的是哪一层
                    ret = Math.min(ret, Math.max(dp[i - 1][x - 1], dp[i][j - x]) + 1);
                }
                dp[i][j] = ret;
            }
        }
        return dp[k][n];
    }
}
