package com.snack.leetcode.n363;

public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length, max = Integer.MIN_VALUE;
        for (int l = 0; l < cols; l++) {
            int[] rowSum = new int[rows];
            for (int r = l; r < cols; r++) {
                for (int i = 0; i < rows; i++) {
                    rowSum[i] += matrix[i][r];
                }
                max = Math.max(max, dpmax(rowSum, k));
            }
        }
        return max;
    }

    private int dpmax(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < arr.length; l++) {
            int sum = 0;
            for (int r = l; r < arr.length; r++) {
                sum += arr[r];
                if (sum > max && sum <= k) max = sum;
            }
        }
        return max;
    }
}
