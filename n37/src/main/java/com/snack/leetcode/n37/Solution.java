package com.snack.leetcode.n37;

public class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);
    }

    boolean backtrack(char[][] board, int i, int j) {
        int m = 9;
        int n = 9;
        if (j == n) {
            return backtrack(board, i + 1, 0);
        }
        if (i == m) {
            return true;
        }
        if (board[i][j] != '.') {
            return backtrack(board, i, j + 1);
        }
        for (char ch = '1'; ch <= '9'; ch++) {
            if (!isValid(board, i, j, ch)) {
                continue;
            }
            board[i][j] = ch;
            if (backtrack(board, i, j + 1)) {
                return true;
            }
            board[i][j] = '.';
        }
        return false;
    }

    private boolean isValid(char[][] board, int i, int j, char ch) {
        for (int x = 0; x < 9; x++) {
            if (board[i][x] == ch) {
                return false;
            }
            if (board[x][j] == ch) {
                return false;
            }
            if (board[(i / 3) * 3 + x / 3][(j / 3) * 3 + x % 3] == ch) {
                return false;
            }
        }
        return true;
    }
}
