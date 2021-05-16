package com.snack.leetcode.n79;

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
    public void exist() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean out = s.exist(board, word);
        Assert.assertTrue(out);
    }

    @Test
    public void exist2() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean out = s.exist(board, word);
        Assert.assertTrue(out);
    }

    @Test
    public void exist3() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        boolean out = s.exist(board, word);
        Assert.assertFalse(out);
    }

    @Test
    public void exist4() {
        char[][] board = {{'A', 'B'}};
        String word = "AB";
        boolean out = s.exist(board, word);
        Assert.assertTrue(out);
    }
}