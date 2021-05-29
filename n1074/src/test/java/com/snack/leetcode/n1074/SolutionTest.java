package com.snack.leetcode.n1074;

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
    public void numSubmatrixSumTarget() {
        int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        int target = 0;
        int out = solution.numSubmatrixSumTarget(matrix, target);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numSubmatrixSumTarget2() {
        int[][] matrix = {{1, -1}, {-1, 1}};
        int target = 0;
        int out = solution.numSubmatrixSumTarget(matrix, target);
        int expected = 5;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numSubmatrixSumTarget3() {
        int[][] matrix = {{904}};
        int target = 0;
        int out = solution.numSubmatrixSumTarget(matrix, target);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numSubmatrixSumTarget4() {
        int[][] matrix = {{0, 1, 1, 1, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 1, 0, 0, 1}, {1, 1, 0, 1, 1, 0}, {1, 0, 0, 1, 0, 0}};
        int target = 0;
        int out = solution.numSubmatrixSumTarget(matrix, target);
        int expected = 43;
        Assert.assertEquals(expected, out);
    }
}