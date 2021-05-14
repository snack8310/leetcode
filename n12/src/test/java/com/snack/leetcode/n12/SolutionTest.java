package com.snack.leetcode.n12;

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
    public void intToRoman() {
        int num = 3;
        String out = s.intToRoman(num);
        String expected = "III";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void intToRoman2() {
        int num = 4;
        String out = s.intToRoman(num);
        String expected = "IV";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void intToRoman3() {
        int num = 58;
        String out = s.intToRoman(num);
        String expected = "LVIII";
        Assert.assertEquals(expected, out);
    }


    @Test
    public void intToRoma4() {
        int num = 1994;
        String out = s.intToRoman(num);
        String expected = "MCMXCIV";
        Assert.assertEquals(expected, out);
    }
}