package com.snack.leetcode.n224;

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
        String input = "1 + 1";
        Assert.assertEquals(2, s.calculate(input));
    }

    @Test
    public void calculate2() {
        String input = "2-1 + 2";
        Assert.assertEquals(3, s.calculate(input));
    }

    @Test
    public void calculate3() {
        String input = "(1+(4+5+2)-3)+(6+8)";
        Assert.assertEquals(23, s.calculate(input));
    }

    @Test
    public void calculate4() {
        String input = "(1+(4+5+2)*3)+(6+8)";
        Assert.assertEquals(48, s.calculate(input));
    }

}