package com.snack.leetcode.n79;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    int[][] np = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        int n = word.length();
        if (n == 0) {
            return false;
        }
        if (board.length == 0) {
            return false;
        }
        boolean ret = false;
        char ch = word.charAt(0);
        Set<String> path = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == ch) {
                    path.add(i + "_" + j);
                    ret = reserve(new int[]{i, j}, board, path, word, 1);
                    if (ret) {
                        return true;
                    }
                    path.remove(i + "_" + j);
                }
            }
        }
        return ret;
    }

    private boolean reserve(int[] position, char[][] board, Set<String> path, String word, int index) {
        if (index == word.length()) {
            // 完成
            return true;
        }
        boolean ans = false;
        int[] nextPosition = new int[2];
        for (int[] npi : np) {
            nextPosition[0] = position[0] + npi[0];
            nextPosition[1] = position[1] + npi[1];
            if (isExist(nextPosition, board) && !path.contains(nextPosition[0] + "_" + nextPosition[1]) && board[nextPosition[0]][nextPosition[1]] == word.charAt(index)) {
                path.add(nextPosition[0] + "_" + nextPosition[1]);
                ans = reserve(nextPosition, board, path, word, index + 1);
                if (ans) {
                    return ans;
                }
                path.remove(nextPosition[0] + "_" + nextPosition[1]);
            }
        }
        return ans;
    }


    private boolean isExist(int[] position, char[][] board) {
        if (position[0] < 0 || position[0] >= board.length) {
            return false;
        }
        if (position[1] < 0 || position[1] >= board[0].length) {
            return false;
        }
        return true;
    }
}
