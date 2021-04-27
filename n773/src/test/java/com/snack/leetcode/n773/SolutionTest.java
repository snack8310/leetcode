package com.snack.leetcode.n773;

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
    public void slidingPuzzle() {
        int[][] board = {{1, 2, 3}, {4, 0, 5}};
        int out = s.slidingPuzzle(board);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void slidingPuzzle2() {
        int[][] board = {{1, 2, 3}, {5, 4, 0}};
        int out = s.slidingPuzzle(board);
        int expert = -1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void slidingPuzzle3() {
        int[][] board = {{4, 1, 2}, {5, 0, 3}};
        int out = s.slidingPuzzle(board);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }
}