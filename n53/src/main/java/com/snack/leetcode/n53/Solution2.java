package com.snack.leetcode.n53;

public class Solution2 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp_0 = nums[0];
        int dp_1 = 0;
        int rtn = dp_0;
        for (int i = 1; i < n; i++) {
            dp_1 = Math.max(dp_0 + nums[i], nums[i]);
            dp_0 = dp_1;
            rtn = Math.max(rtn, dp_1);
        }
        return rtn;
    }
}
