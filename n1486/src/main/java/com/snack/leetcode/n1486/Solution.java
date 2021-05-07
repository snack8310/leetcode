package com.snack.leetcode.n1486;

public class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= 2 * i + start;
        }
        return ans;
    }
}
