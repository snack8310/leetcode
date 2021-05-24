package com.snack.leetcode.n664;

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
    public void strangePrinter() {
        String s = "aaabbb";
        int out = solution.strangePrinter(s);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void strangePrinter2() {
        String s = "aba";
        int out = solution.strangePrinter(s);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}