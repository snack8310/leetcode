package com.snack.leetcode.n76;

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
    public void minWindow() {
        String s = "ADOBECODEBANC", t = "ABC";
        String out = solution.minWindow(s, t);
        String expert = "BANC";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minWindow2() {
        String s = "a", t = "a";
        String out = solution.minWindow(s, t);
        String expert = "a";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minWindow3() {
        String s = "a", t = "aa";
        String out = solution.minWindow(s, t);
        String expert = "";
        Assert.assertEquals(expert, out);
    }
}