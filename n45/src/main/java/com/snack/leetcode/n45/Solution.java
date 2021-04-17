package com.snack.leetcode.n45;

public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int farthest = 0;
        int jumps = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(nums[i] + i, farthest);
            if (end == i) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}
