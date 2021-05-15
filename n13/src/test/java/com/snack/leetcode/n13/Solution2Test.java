package com.snack.leetcode.n13;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution2();
    }

    @Test
    public void romanToInt() {
        String s = "III";
        int out = solution.romanToInt(s);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void romanToInt2() {
        String s = "IV";
        int out = solution.romanToInt(s);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void romanToInt3() {
        String s = "IX";
        int out = solution.romanToInt(s);
        int expected = 9;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void romanToInt4() {
        String s = "LVIII";
        int out = solution.romanToInt(s);
        int expected = 58;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void romanToInt5() {
        String s = "MCMXCIV";
        int out = solution.romanToInt(s);
        int expected = 1994;
        Assert.assertEquals(expected, out);
    }
}