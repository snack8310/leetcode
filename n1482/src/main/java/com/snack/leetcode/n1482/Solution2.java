package com.snack.leetcode.n1482;

import java.util.TreeSet;

public class Solution2 {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m > bloomDay.length / k) {
            return -1;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int b : bloomDay) {
            set.add(b);
        }
        int[][] dp = new int[set.size()][bloomDay.length + 1];
        int i = 0;
        for (Integer day : set) {
            int ci = 0;
            for (int j = 1; j <= bloomDay.length; j++) {
                if (bloomDay[j - 1] > day) {
                    ci = 0;
                } else {
                    ci++;
                }
                dp[i][j] = Math.max(dp[i][j - 1], (ci >= k ? 1 : 0) + (j >= k ? dp[i][j - k] : 0));
                if (dp[i][j] >= m) {
                    return day;
                }
            }
            i++;
        }
        return -1;
    }
}
