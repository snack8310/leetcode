package com.snack.leetcode.n1143;

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
    public void longestCommonSubsequence() {
        String text1 = "abcde";
        String text2 = "ace";
        int out = s.longestCommonSubsequence(text1, text2);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void longestCommonSubsequence2() {
        String text1 = "abc";
        String text2 = "abc";
        int out = s.longestCommonSubsequence(text1, text2);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void longestCommonSubsequence3() {
        String text1 = "abc";
        String text2 = "def";
        int out = s.longestCommonSubsequence(text1, text2);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void longestCommonSubsequence4() {
        String text1 = "";
        String text2 = "def";
        int out = s.longestCommonSubsequence(text1, text2);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void longestCommonSubsequence5() {
        String text1 = "abc";
        String text2 = "";
        int out = s.longestCommonSubsequence(text1, text2);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void longestCommonSubsequence6() {
        String text1 = "";
        String text2 = "";
        int out = s.longestCommonSubsequence(text1, text2);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}