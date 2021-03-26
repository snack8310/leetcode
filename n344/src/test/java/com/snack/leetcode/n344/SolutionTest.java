package com.snack.leetcode.n344;

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
    public void reverseString() {
        String ss = "hello";
        char[] chars = ss.toCharArray();
        s.reverseString(chars);
        String out = String.copyValueOf(chars);
        String expert = "olleh";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void reverseString2() {
        String ss = "Hannah";
        char[] chars = ss.toCharArray();
        s.reverseString(chars);
        String out = String.copyValueOf(chars);
        String expert = "hannaH";
        Assert.assertEquals(expert, out);
    }
}