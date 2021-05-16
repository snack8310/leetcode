package com.snack.leetcode.n792;

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
    public void numMatchingSubseq() {
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        int out = solution.numMatchingSubseq(s, words);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numMatchingSubseq2() {
        String s = "dsahjpjauf";
        String[] words = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
        int out = solution.numMatchingSubseq(s, words);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}