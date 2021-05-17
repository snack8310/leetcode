package com.snack.leetcode.n42;

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
    public void trap() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int out = s.trap(height);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void trap2() {
        int[] height = {4, 2, 0, 3, 2, 5};
        int out = s.trap(height);
        int expected = 9;
        Assert.assertEquals(expected, out);
    }
}