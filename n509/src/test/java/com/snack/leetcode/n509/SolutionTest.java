package com.snack.leetcode.n509;

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
    public void fib() {
        int n = 2;
        int out = s.fib(n);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void fib2() {
        int n = 3;
        int out = s.fib(n);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}