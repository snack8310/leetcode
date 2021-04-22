package com.snack.leetcode.n698;

public class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k != 0) {
            return false;
        }
        boolean[] memo = new boolean[nums.length];
        return dfs(nums, k, sum / k, sum / k, 0, memo);
    }

    private boolean dfs(int[] nums, int group, int rest, int avg, int idx, boolean[] memo) {
        if (group == 0) return true;
        for (int i = idx; i < nums.length; i++) {
            if (!memo[i]) {
                memo[i] = true;
                if (nums[i] < rest && dfs(nums, group, rest - nums[i], avg, i + 1, memo) || nums[i] == rest && dfs(nums, group - 1, avg, avg, 0, memo)) {
                    return true;
                }
                memo[i] = false;
            }
        }
        return false;
    }
}
