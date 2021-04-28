package com.snack.leetcode.n172;

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
    public void trailingZeroes() {
        int n = 3;
        int out = s.trailingZeroes(n);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void trailingZeroes2() {
        int n = 5;
        int out = s.trailingZeroes(n);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void trailingZeroes3() {
        int n = 25;
        int out = s.trailingZeroes(n);
        int expert = 6;
        Assert.assertEquals(expert, out);
    }
}