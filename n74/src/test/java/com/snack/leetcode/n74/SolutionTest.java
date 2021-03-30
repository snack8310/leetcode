package com.snack.leetcode.n74;

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
    public void searchMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean out = s.searchMatrix(matrix, target);
        Assert.assertTrue(out);
    }

    @Test
    public void searchMatrix2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean out = s.searchMatrix(matrix, target);
        Assert.assertFalse(out);
    }

    @Test
    public void searchMatrix3() {
        int[][] matrix = {{1}};
        int target = 0;
        boolean out = s.searchMatrix(matrix, target);
        Assert.assertFalse(out);
    }
}