package com.snack.leetcode.n227;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void calculate() {
        String input = "3+2*2";
        Assert.assertEquals(7, s.calculate(input));
    }

    @Test
    public void calculate1() {
        String input = " 3/2 ";
        Assert.assertEquals(1, s.calculate(input));
    }

    @Test
    public void calculate2() {
        String input = "3+5 / 2";
        Assert.assertEquals(5, s.calculate(input));
    }
}