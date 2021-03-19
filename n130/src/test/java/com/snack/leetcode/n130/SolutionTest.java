package com.snack.leetcode.n130;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void solve() {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        s.solve(board);
        char[][] expert = {{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}};
        for (int i = 0; i < board.length; i++) {
            Assert.assertArrayEquals(expert[i], board[i]);
        }
    }

    @Test
    public void solve2() {
        char[][] board = {{'X'}};
        s.solve(board);
        char[][] expert = {{'X'}};
        for (int i = 0; i < board.length; i++) {
            Assert.assertArrayEquals(expert[i], board[i]);
        }
    }
}