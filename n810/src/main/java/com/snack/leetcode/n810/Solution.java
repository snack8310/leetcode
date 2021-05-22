package com.snack.leetcode.n810;

public class Solution {
    public boolean xorGame(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) {
            return true;
        }
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        return ret == 0;
    }
}
