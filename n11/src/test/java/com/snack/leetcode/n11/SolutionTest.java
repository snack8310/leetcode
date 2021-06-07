package com.snack.leetcode.n11;

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
    public void maxArea() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int out = solution.maxArea(height);
        int expected = 49;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxArea2() {
        int[] height = {1, 1};
        int out = solution.maxArea(height);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxArea3() {
        int[] height = {4, 3, 2, 1, 4};
        int out = solution.maxArea(height);
        int expected = 16;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxArea4() {
        int[] height = {1, 2, 1};
        int out = solution.maxArea(height);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}