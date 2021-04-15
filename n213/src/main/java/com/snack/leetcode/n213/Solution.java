package com.snack.leetcode.n213;

public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        return Math.max(getRtn(nums, 0, n - 1), getRtn(nums, 1, n));
    }

    private int getRtn(int[] nums, int start, int end) {
        int n = end - start;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[start];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i - 1]);
        }
        return dp[n];
    }
}
