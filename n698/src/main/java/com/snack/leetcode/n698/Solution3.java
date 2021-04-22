package com.snack.leetcode.n698;

import java.util.Arrays;

public class Solution3 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k != 0) {
            return false;
        }
        int[] bucket = new int[k];
        int target = sum / k;
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        for (; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return backtrack(nums, 0, bucket, target);
    }

    private boolean backtrack(int[] nums, int index, int[] bucket, int target) {
        if (index == nums.length) {
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] != target) {
                    return false;
                }
            }
            return true;
        }
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] + nums[index] > target) {
                continue;
            }
            bucket[i] += nums[index];
            if (backtrack(nums, index + 1, bucket, target)) {
                return true;
            }
            bucket[i] -= nums[index];
        }
        return false;
    }
}
