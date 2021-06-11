package com.snack.leetcode.n279;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void numSquares() {
        int n = 12;
        int out = solution.numSquares(n);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numSquares2() {
        int n = 13;
        int out = solution.numSquares(n);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}