package com.snack.leetcode.n65;

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
    public void isNumber() {
        String s = "0";
        boolean out = solution.isNumber(s);
        Assert.assertTrue(out);
    }

    @Test
    public void isNumber2() {
        String s = "e";
        boolean out = solution.isNumber(s);
        Assert.assertFalse(out);
    }

    @Test
    public void isNumber3() {
        String s = ".";
        boolean out = solution.isNumber(s);
        Assert.assertFalse(out);
    }

    @Test
    public void isNumber4() {
        String s = ".1";
        boolean out = solution.isNumber(s);
        Assert.assertTrue(out);
    }
}