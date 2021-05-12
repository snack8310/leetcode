package com.snack.leetcode.n1310;

public class Solution2 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] perXOR = new int[n + 1];
        for (int i = 0; i < n; i++) {
            perXOR[i + 1] = perXOR[i] ^ arr[i];
        }
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = perXOR[queries[i][0]] ^ perXOR[queries[i][1] + 1];
        }
        return ans;
    }
}
