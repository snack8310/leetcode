package com.snack.leetcode.n316;

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
    public void removeDuplicateLetters() {
        String s = "bcabc";
        String out = solution.removeDuplicateLetters(s);
        String expert = "abc";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void removeDuplicateLetters2() {
        String s = "cbacdcbc";
        String out = solution.removeDuplicateLetters(s);
        String expert = "acdb";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void removeDuplicateLetters3() {
        String s = "";
        String out = solution.removeDuplicateLetters(s);
        String expert = "";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void removeDuplicateLetters4() {
        String s = "a";
        String out = solution.removeDuplicateLetters(s);
        String expert = "a";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void removeDuplicateLetters5() {
        String s = "aa";
        String out = solution.removeDuplicateLetters(s);
        String expert = "a";
        Assert.assertEquals(expert, out);
    }
}