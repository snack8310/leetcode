package com.snack.leetcode.n483;

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
    public void smallestGoodBase() {
        String n = "13";
        String out = solution.smallestGoodBase(n);
        String expected = "3";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void smallestGoodBase2() {
        String n = "4681";
        String out = solution.smallestGoodBase(n);
        String expected = "8";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void smallestGoodBase3() {
        String n = "1000000000000000000";
        String out = solution.smallestGoodBase(n);
        String expected = "999999999999999999";
        Assert.assertEquals(expected, out);
    }
}