package com.snack.leetcode.n130;

public class Solution {

    public void solve(char[][] board) {
        dfsAround(board);
        replaceAll(board);
    }

    private void replaceAll(char[][] board) {
        int im = board.length;
        int jm = board[0].length;
        for (int i = 0; i < im; i++) {
            for (int j = 0; j < jm; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfsAround(char[][] board) {
        int im = board.length;
        int jm = board[0].length;
        for (int j = 0; j < jm; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
            if (board[im - 1][j] == 'O') {
                dfs(board, im - 1, j);
            }
        }
        for (int i = 0; i < im; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][jm - 1] == 'O') {
                dfs(board, i, jm - 1);
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }
        if (board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'A';
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
    }

}
