package com.snack.leetcode.n494;

public class Solution {

    int result = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) {
            return 0;
        }
        backtrack(nums, 0, S);
        return result;
    }

    private void backtrack(int[] nums, int i, int s) {
        if (i == nums.length) {
            if (s == 0) {
                result++;
            }
            return;
        }
        backtrack(nums, i + 1, s + nums[i]);
        backtrack(nums, i + 1, s - nums[i]);
    }
}
