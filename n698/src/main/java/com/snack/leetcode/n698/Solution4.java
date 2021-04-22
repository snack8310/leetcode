package com.snack.leetcode.n698;

public class Solution4 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k != 0) {
            return false;
        }
        boolean[] used = new boolean[nums.length];
        int target = sum / k;
        return backtrack(k, 0, nums, 0, used, target);
    }

    private boolean backtrack(int k, int bucket, int[] nums, int start, boolean[] used, int target) {
        if (k == 0) {
            return true;
        }
        if (bucket == target) {
            return backtrack(k - 1, 0, nums, 0, used, target);
        }

        for (int i = start; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (nums[i] + bucket > target) {
                continue;
            }
            used[i] = true;
            bucket += nums[i];
            if (backtrack(k, bucket, nums, i + 1, used, target)) {
                return true;
            }
            used[i] = false;
            bucket -= nums[i];
        }
        return false;
    }
}
