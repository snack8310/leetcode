package com.snack.leetcode.n1734;

public class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;
        int[] perm = new int[n + 1];
        int all = 0;
        for (int i = 1; i <= n + 1; i++) {
            all ^= i;
        }
        int non_first = 0;
        for (int i = 1; i < n; i += 2) {
            non_first ^= encoded[i];
        }
        perm[0] = all ^ non_first;
        for (int i = 1; i <= n; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        return perm;
    }
}
