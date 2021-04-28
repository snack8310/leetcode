package com.snack.leetcode.n231;

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
    public void isPowerOfTwo() {
        int n = 1;
        boolean out = s.isPowerOfTwo(n);
        Assert.assertTrue(out);
    }

    @Test
    public void isPowerOfTwo2() {
        int n = 16;
        boolean out = s.isPowerOfTwo(n);
        Assert.assertTrue(out);
    }

    @Test
    public void isPowerOfTwo3() {
        int n = 218;
        boolean out = s.isPowerOfTwo(n);
        Assert.assertFalse(out);
    }

    @Test
    public void isPowerOfTwo4() {
        int n = 0;
        boolean out = s.isPowerOfTwo(n);
        Assert.assertFalse(out);
    }
}