package com.snack.leetcode.n496;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] rtn = new int[n];
        for (int i = 0; i < n; i++) {
            rtn[i] = nextGreaterElement(nums1[i], nums2);
        }
        return rtn;
    }

    private int nextGreaterElement(int num, int[] nums) {
        int rtn = -1;
        boolean isRight = false;
        for (int i = 0; i < nums.length; i++) {
            if (!isRight && num == nums[i]) {
                isRight = true;
            }
            if (isRight && num < nums[i]) {
                rtn = nums[i];
                break;
            }
        }
        return rtn;
    }
}
