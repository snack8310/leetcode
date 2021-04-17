package com.snack.leetcode.n55;

public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return false;
        }
        int farthest = 0;
        for (int i = 0; i < n; i++) {
            if (i <= farthest) {
                farthest = Math.max(farthest, i + nums[i]);
                if (farthest >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
