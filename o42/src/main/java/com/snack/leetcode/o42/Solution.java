package com.snack.leetcode.o42;

public class Solution {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = nums[0];
        int cur = nums[0];
        for (int i = 1; i < n; i++) {
            if (cur <= 0) {
                cur = nums[i];
            } else {
                cur += nums[i];
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
