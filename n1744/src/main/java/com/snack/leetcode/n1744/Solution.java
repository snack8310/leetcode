package com.snack.leetcode.n1744;

public class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = queries.length;
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++) {
            ans[i] = canEat(candiesCount, queries[i]);
        }
        return ans;
    }

    public boolean canEat(int[] candiesCount, int[] queries) {
        int favoriteType = queries[0];
        int favoriteDay = queries[1];
        int dailyCap = queries[2];
        int minCap = 0;
        int maxCap = 0;
        for (int i = 0; i <= favoriteType; i++) {
            if (i != favoriteType) {
                minCap += candiesCount[i];
            } else {
                minCap += 1;
            }
            maxCap += candiesCount[i];
        }
        long minFavorDayCap = (favoriteDay + 1) * 1;
        long maxFavorDayCap = (long) (favoriteDay + 1) * dailyCap;
        return !(maxFavorDayCap < minCap || maxCap < minFavorDayCap);
    }
}
