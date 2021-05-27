package com.snack.leetcode.n461;

public class Solution {
    public int hammingDistance(int x, int y) {
        int c = x ^ y;
        int ret = 0;
        while (c != 0) {
            ret += c & 1;
            c = c >> 1;
        }
        return ret;
    }
}
