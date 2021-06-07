package com.snack.leetcode.n11;

public class Solution2 {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n <= 1) {
            return 0;
        }
        int ans = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
