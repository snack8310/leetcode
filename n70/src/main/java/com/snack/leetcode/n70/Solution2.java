package com.snack.leetcode.n70;

public class Solution2 {
    public int climbStairs(int n) {
        int p0 = 0;
        int p1 = 0;
        int p2 = 1;
        for (int i = 1; i <= n; i++) {
            p0 = p1;
            p1 = p2;
            p2 = p0 + p1;
        }
        return p2;
    }
}
