package com.snack.leetcode.n53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }
        int rtn = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            rtn = Math.max(rtn, dp[i]);
        }
        return rtn;
    }
}
