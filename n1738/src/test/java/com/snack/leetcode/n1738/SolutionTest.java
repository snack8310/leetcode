package com.snack.leetcode.n1738;

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
    public void kthLargestValue() {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 1;
        int out = s.kthLargestValue(matrix, k);
        int expected = 7;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void kthLargestValue2() {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 2;
        int out = s.kthLargestValue(matrix, k);
        int expected = 5;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void kthLargestValue3() {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 3;
        int out = s.kthLargestValue(matrix, k);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }
}