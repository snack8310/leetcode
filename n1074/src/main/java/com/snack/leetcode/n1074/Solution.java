package com.snack.leetcode.n1074;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        //前缀和
        int[][] s = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                s[i][j] = s[i][j - 1] + matrix[i][j - 1];
            }
        }
        //高度k从1到m遍历宽度前缀和
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += s[k][j] - s[k][i - 1];
                    res += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return res;
    }
}
