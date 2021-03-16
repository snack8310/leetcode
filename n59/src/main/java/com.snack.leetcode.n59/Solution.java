package com.snack.leetcode.n59;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    final int[] direction_right = {0, 1};
    final int[] direction_left = {0, -1};
    final int[] direction_top = {-1, 0};
    final int[] direction_bottom = {1, 0};
    private List<int[]> direction_order;
    private int[] current_direction;
    private int current_direction_index = 0;

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        initDirection();
        int i = 0, j = 0;
        int count = 0;
        while (count++ < n * n) {
            matrix[i][j] = count;
            if (isNextExist(matrix, i, j)) {
                changeDirection();
            }
            i += current_direction[0];
            j += current_direction[1];
        }
        return matrix;
    }

    private boolean isNextExist(int[][] matrix, int i, int j) {
        int ci = i + current_direction[0];
        int cj = j + current_direction[1];
        if (ci < 0 || ci >= matrix.length || cj < 0 || cj >= matrix[0].length) {
            return true;
        }
        if (matrix[ci][cj] > 0) {
            return true;
        }
        return false;
    }

    private void changeDirection() {
        current_direction_index = (current_direction_index + 1) % direction_order.size();
        current_direction = direction_order.get(current_direction_index);
    }

    private void initDirection() {
        direction_order = new LinkedList<>();
        direction_order.add(direction_right);
        direction_order.add(direction_bottom);
        direction_order.add(direction_left);
        direction_order.add(direction_top);
        current_direction = direction_order.get(0);
    }

}
