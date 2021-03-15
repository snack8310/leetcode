package com.snack.leetcode.n54;

import java.util.Arrays;
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
    private int[][] assMatrix;

    public List<Integer> spiralOrder(int[][] matrix) {
        initDirection();
        initAssM(matrix);
        List<Integer> rtn = new LinkedList<>();
        int row = matrix.length;
        int line = matrix[0].length;
        int size = row * line;
        int i = 0, j = 0;
        while (rtn.size() < size) {
            rtn.add(matrix[i][j]);
            assMatrix[i][j] = 1;
            if (isNextExist(i, j)) {
                changeDirection();
            }
            i += current_direction[0];
            j += current_direction[1];
        }

        return rtn;
    }

    private void initAssM(int[][] matrix) {
        assMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < assMatrix.length; i++) {
            Arrays.fill(assMatrix[i], 0);
        }
    }

    private void changeDirection() {
        current_direction_index = (current_direction_index + 1) % direction_order.size();
        current_direction = direction_order.get(current_direction_index);
    }

    private boolean isNextExist(int i, int j) {
        int ci = i + current_direction[0];
        int cj = j + current_direction[1];
        if (ci < 0 || ci >= assMatrix.length || cj < 0 || cj >= assMatrix[0].length) {
            return true;
        }
        if (assMatrix[ci][cj] == 1) {
            return true;
        }
        return false;
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
