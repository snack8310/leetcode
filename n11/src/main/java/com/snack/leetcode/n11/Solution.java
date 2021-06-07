package com.snack.leetcode.n11;

public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n <= 1) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans = Math.max(ans, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return ans;
    }
}
