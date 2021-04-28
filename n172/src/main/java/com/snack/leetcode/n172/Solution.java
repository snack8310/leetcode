package com.snack.leetcode.n172;

public class Solution {
    public int trailingZeroes(int n) {
        if (n <= 0) {
            return 0;
        }
        int ans = 0;
        int i = 5;
        while (i <= n) {
            int temp = i / 5;
            while (temp % 5 == 0 && temp != 0) {
                temp = temp / 5;
                ans++;
            }
            ans++;
            i += 5;
        }
        return ans;
    }
}
