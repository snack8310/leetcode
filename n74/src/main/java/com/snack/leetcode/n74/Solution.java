package com.snack.leetcode.n74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        int mid;
        int left = -1;
        int right = m - 1;
        while (left < right) {
            mid = (left + right + 1) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (target < matrix[mid][0]) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        int row = left;
        if (row < 0) {
            return false;
        }
        left = -1;
        right = n - 1;
        while (left < right) {
            mid = (left + right + 1) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return false;
    }
}
