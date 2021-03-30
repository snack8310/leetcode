package com.snack.leetcode.n26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }
}
