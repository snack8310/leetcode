package com.snack.leetcode.n73;

import java.util.Arrays;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] cel = new boolean[n];
        Arrays.fill(row, false);
        Arrays.fill(cel, false);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    cel[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || cel[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
