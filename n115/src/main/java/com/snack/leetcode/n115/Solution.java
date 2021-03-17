package com.snack.leetcode.n115;

public class Solution {

    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        return helper(m - 1, n - 1, s, t);
    }

    private int helper(int i, int j, String s, String t) {
        if (j < 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        if (s.charAt(i) == t.charAt(j)) {
            return helper(i - 1, j, s, t) + helper(i - 1, j - 1, s, t);
        } else {
            return helper(i - 1, j, s, t);
        }
    }
}
