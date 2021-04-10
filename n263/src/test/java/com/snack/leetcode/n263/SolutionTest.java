package com.snack.leetcode.n263;

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
    public void isUgly() {
        int n = 6;
        boolean out = s.isUgly(n);
        Assert.assertTrue(out);
    }

    @Test
    public void isUgly2() {
        int n = 8;
        boolean out = s.isUgly(n);
        Assert.assertTrue(out);
    }

    @Test
    public void isUgly3() {
        int n = 14;
        boolean out = s.isUgly(n);
        Assert.assertFalse(out);
    }

    @Test
    public void isUgly4() {
        int n = 1;
        boolean out = s.isUgly(n);
        Assert.assertTrue(out);
    }
}