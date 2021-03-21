package com.snack.leetcode.n73;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void setZeroes() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        s.setZeroes(matrix);
        int[][] expert = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        Assert.assertArrayEquals(expert, matrix);
    }

    @Test
    public void setZeroes2() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        s.setZeroes(matrix);
        int[][] expert = {{0, 0, 0, 0,}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        Assert.assertArrayEquals(expert, matrix);
    }
}