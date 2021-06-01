package com.snack.leetcode.n14;

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
    public void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        String out = solution.longestCommonPrefix(strs);
        String expected = "fl";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void longestCommonPrefix2() {
        String[] strs = {"dog", "racecar", "car"};
        String out = solution.longestCommonPrefix(strs);
        String expected = "";
        Assert.assertEquals(expected, out);
    }
}