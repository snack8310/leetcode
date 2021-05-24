package com.snack.leetcode.n664;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int strangePrinter(String s) {
        Map<Character, int[]> ps = new HashMap<>();
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        min = Math.min(min, dp[i][k] + dp[k + 1][j]);
                    }
                    dp[i][j] = min;
                }
            }
        }
        return dp[0][n - 1];
    }
}
