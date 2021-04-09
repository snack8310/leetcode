package com.snack.leetcode.n516;

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
    public void longestPalindromeSubseq() {
        String s = "bbbab";
        int out = solution.longestPalindromeSubseq(s);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void longestPalindromeSubseq2() {
        String s = "cbbd";
        int out = solution.longestPalindromeSubseq(s);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}