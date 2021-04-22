package com.snack.leetcode.n363;

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
    public void maxSumSubmatrix() {
        int[][] matrix = {{1, 0, 1}, {0, -2, 3}};
        int k = 2;
        int out = s.maxSumSubmatrix(matrix, k);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void maxSumSubmatrix2() {
        int[][] matrix = {{2, 2, -1}};
        int k = 3;
        int out = s.maxSumSubmatrix(matrix, k);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }
}