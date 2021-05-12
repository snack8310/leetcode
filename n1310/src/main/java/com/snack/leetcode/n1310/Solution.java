package com.snack.leetcode.n1310;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<String, Integer> memo = new HashMap<>();

    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int[] q = queries[i];
            int left = q[0];
            int right = q[1];
            res[i] = getXOR(left, right, arr);
        }
        return res;
    }

    private int getXOR(int left, int right, int[] arr) {
        if (left == right) {
            return arr[left];
        }
        String key = left + "_" + right;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int ret = arr[left] ^ getXOR(left + 1, right, arr);
        memo.put(key, ret);
        return ret;
    }

}
