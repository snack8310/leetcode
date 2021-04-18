package com.snack.leetcode.n10;

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
    public void isMatch() {
        String s = "aa";
        String p = "a";
        boolean out = solution.isMatch(s, p);
        Assert.assertFalse(out);
    }

    @Test
    public void isMatch2() {
        String s = "aab";
        String p = "c*a*b";
        boolean out = solution.isMatch(s, p);
        Assert.assertTrue(out);
    }

    @Test
    public void isMatch3() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean out = solution.isMatch(s, p);
        Assert.assertFalse(out);
    }

    @Test
    public void isMatch4() {
        String s = "aa";
        String p = "a*";
        boolean out = solution.isMatch(s, p);
        Assert.assertTrue(out);
    }
}