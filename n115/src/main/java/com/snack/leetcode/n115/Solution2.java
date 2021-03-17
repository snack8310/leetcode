package com.snack.leetcode.n115;

import java.util.Arrays;

public class Solution2 {

    private int[][] memo;

    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }
        return helper(m - 1, n - 1, s, t);
    }

    private int helper(int i, int j, String s, String t) {
        if (j < 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {
            memo[i][j] = helper(i - 1, j, s, t) + helper(i - 1, j - 1, s, t);
        } else {
            memo[i][j] = helper(i - 1, j, s, t);
        }
        return memo[i][j];
    }
}
