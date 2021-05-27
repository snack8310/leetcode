package com.snack.leetcode.n70;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void climbStairs() {
        int n = 2;
        int out = s.climbStairs(n);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void climbStairs2() {
        int n = 3;
        int out = s.climbStairs(n);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void climbStairs3() {
        int n = 1;
        int out = s.climbStairs(n);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}