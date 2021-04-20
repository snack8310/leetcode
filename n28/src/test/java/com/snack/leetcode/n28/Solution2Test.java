package com.snack.leetcode.n28;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void strStr() {
        String haystack = "hello";
        String needle = "ll";
        int out = s.strStr(haystack, needle);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void strStr2() {
        String haystack = "aaaaa";
        String needle = "bba";
        int out = s.strStr(haystack, needle);
        int expert = -1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void strStr3() {
        String haystack = "";
        String needle = "";
        int out = s.strStr(haystack, needle);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}