package com.snack.leetcode.n342;

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
    public void isPowerOfFour() {
        int n = 16;
        boolean out = solution.isPowerOfFour(n);
        Assert.assertTrue(out);
    }

    @Test
    public void isPowerOfFour2() {
        int n = 5;
        boolean out = solution.isPowerOfFour(n);
        Assert.assertFalse(out);
    }

    @Test
    public void isPowerOfFour3() {
        int n = 1;
        boolean out = solution.isPowerOfFour(n);
        Assert.assertTrue(out);
    }
}