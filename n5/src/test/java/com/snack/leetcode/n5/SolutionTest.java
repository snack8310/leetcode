package com.snack.leetcode.n5;

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
    public void longestPalindrome() {
        String s = "babad";
        String out = solution.longestPalindrome(s);
        String expected = "bab";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void longestPalindrome2() {
        String s = "cbbd";
        String out = solution.longestPalindrome(s);
        String expected = "bb";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void longestPalindromea3() {
        String s = "a";
        String out = solution.longestPalindrome(s);
        String expected = "a";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void longestPalindromea4() {
        String s = "ac";
        String out = solution.longestPalindrome(s);
        String expected = "a";
        Assert.assertEquals(expected, out);
    }
}