package com.snack.leetcode.n633;

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
    public void judgeSquareSum() {
        int c = 5;
        boolean out = s.judgeSquareSum(c);
        Assert.assertTrue(out);
    }

    @Test
    public void judgeSquareSum2() {
        int c = 3;
        boolean out = s.judgeSquareSum(c);
        Assert.assertFalse(out);
    }

    @Test
    public void judgeSquareSum3() {
        int c = 4;
        boolean out = s.judgeSquareSum(c);
        Assert.assertTrue(out);
    }

    @Test
    public void judgeSquareSum5() {
        int c = 2;
        boolean out = s.judgeSquareSum(c);
        Assert.assertTrue(out);
    }

    @Test
    public void judgeSquareSum6() {
        int c = 1;
        boolean out = s.judgeSquareSum(c);
        Assert.assertTrue(out);
    }
}