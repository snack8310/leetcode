package com.snack.leetcode.n81;

public class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return false;
        }
        int left, mid, right;
        left = 0;
        right = n - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[left] == nums[mid]) {
                left++;
                continue;
            }
            if (nums[left] < nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
