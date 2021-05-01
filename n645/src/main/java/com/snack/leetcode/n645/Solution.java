package com.snack.leetcode.n645;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            nums[(num - 1) % n] += n;
        }
        int[] ret = new int[2];
        for (int i = 0; i < n; i++) {
            if (nums[i] > n * 2) {
                ret[0] = i + 1;
            }
            if (nums[i] < n + 1) {
                ret[1] = i + 1;
            }
        }
        return ret;
    }
}
