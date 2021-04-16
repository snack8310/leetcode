package com.snack.leetcode.n87;

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
    public void isScramble() {
        String s1 = "great";
        String s2 = "rgeat";
        boolean out = s.isScramble(s1, s2);
        Assert.assertTrue(out);
    }

    @Test
    public void isScramble2() {
        String s1 = "abcde";
        String s2 = "caebd";
        boolean out = s.isScramble(s1, s2);
        Assert.assertFalse(out);
    }

    @Test
    public void isScramble3() {
        String s1 = "a";
        String s2 = "a";
        boolean out = s.isScramble(s1, s2);
        Assert.assertTrue(out);
    }
}