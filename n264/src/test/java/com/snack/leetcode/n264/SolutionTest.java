package com.snack.leetcode.n264;

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
    public void nthUglyNumber() {
        int n = 10;
        int out = s.nthUglyNumber(n);
        int expert = 12;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void nthUglyNumber2() {
        int n = 1;
        int out = s.nthUglyNumber(n);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }
}