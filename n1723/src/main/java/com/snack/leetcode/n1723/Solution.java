package com.snack.leetcode.n1723;

public class Solution {
    int ans = 0x3f3f3f3f;

    public int minimumTimeRequired(int[] jobs, int k) {
        int n = jobs.length;
        int[] sum = new int[k];
        dfs(0, sum, 0, jobs, k);
        return ans;
    }

    private void dfs(int index, int[] sum, int max, int[] jobs, int k) {
        if (max >= ans) {
            return;
        }
        if (index == jobs.length) {
            ans = max;
            return;
        }
        for (int i = 0; i < k; i++) {
            sum[i] += jobs[index];
            dfs(index + 1, sum, Math.max(sum[i], max), jobs, k);
            sum[i] -= jobs[index];
        }
    }
}
