package com.snack.leetcode.n115;

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
    public void numDistinct() {
        String s = "rabbbit", t = "rabbit";
        int out = solution.numDistinct(s, t);
        Assert.assertEquals(3, out);
    }

    @Test
    public void numDistinct2() {
        String s = "babgbag", t = "bag";
        int out = solution.numDistinct(s, t);
        Assert.assertEquals(5, out);
    }
}