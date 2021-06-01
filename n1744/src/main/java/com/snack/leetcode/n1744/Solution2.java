package com.snack.leetcode.n1744;

public class Solution2 {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = queries.length;
        boolean[] ans = new boolean[n];
        int m = candiesCount.length;
        if (m == 0) {
            return ans;
        }
        long[] sums = new long[m];
        sums[0] = candiesCount[0];
        for (int i = 1; i < m; i++) {
            sums[i] = sums[i - 1] + candiesCount[i];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = canEat(sums, queries[i]);
        }
        return ans;
    }

    public boolean canEat(long[] sums, int[] queries) {
        int favoriteType = queries[0];
        int favoriteDay = queries[1];
        int dailyCap = queries[2];
        long minCap = favoriteType == 0 ? 1 : sums[favoriteType - 1] + 1;
        long maxCap = sums[favoriteType];
        long minFavorDayCap = (favoriteDay + 1) * 1;
        long maxFavorDayCap = (long) (favoriteDay + 1) * dailyCap;
        return !(maxFavorDayCap < minCap || maxCap < minFavorDayCap);
    }
}
