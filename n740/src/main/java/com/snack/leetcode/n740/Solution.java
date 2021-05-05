package com.snack.leetcode.n740;

public class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        //构件数组
        int[] all = new int[max + 1];
        for (int num : nums) {
            all[num]++;
        }
        //动态规划
        int[] dp = new int[max + 1];
        dp[0] = 0;
        dp[1] = all[1] * 1;
        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * all[i]);
        }
        return dp[max];
    }
}
