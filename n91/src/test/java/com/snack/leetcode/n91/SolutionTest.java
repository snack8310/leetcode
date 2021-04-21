package com.snack.leetcode.n91;

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
    public void numDecodings() {
        String s = "12";
        int out = solution.numDecodings(s);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numDecodings2() {
        String s = "226";
        int out = solution.numDecodings(s);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numDecodings3() {
        String s = "0";
        int out = solution.numDecodings(s);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numDecodings4() {
        String s = "06";
        int out = solution.numDecodings(s);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numDecodings5() {
        String s = "2101";
        int out = solution.numDecodings(s);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numDecodings6() {
        String s = "10";
        int out = solution.numDecodings(s);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numDecodings7() {
        String s = "1123";
        int out = solution.numDecodings(s);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }

}