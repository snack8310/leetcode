package com.snack.leetcode.n1269;

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
    public void numWays() {
        int steps = 3;
        int arrLen = 2;
        int out = s.numWays(steps, arrLen);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numWays2() {
        int steps = 2;
        int arrLen = 4;
        int out = s.numWays(steps, arrLen);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numWays3() {
        int steps = 4;
        int arrLen = 2;
        int out = s.numWays(steps, arrLen);
        int expected = 8;
        Assert.assertEquals(expected, out);
    }
}