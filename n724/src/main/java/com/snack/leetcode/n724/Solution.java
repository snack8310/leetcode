package com.snack.leetcode.n724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int ret = 0;
        int leftSum = 0;
        while (ret < n) {
            if (leftSum * 2 == sum - nums[ret]) {
                return ret;
            }
            leftSum += nums[ret];
            ret++;
        }
        return -1;
    }
}
