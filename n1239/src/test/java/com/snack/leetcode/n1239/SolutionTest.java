package com.snack.leetcode.n1239;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void maxLength() {
        String[] arr = {"un", "iq", "ue"};
        int out = solution.maxLength(Arrays.asList(arr));
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxLength2() {
        String[] arr = {"cha", "r", "act", "ers"};
        int out = solution.maxLength(Arrays.asList(arr));
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxLength3() {
        String[] arr = {"abcdefghijklmnopqrstuvwxyz"};
        int out = solution.maxLength(Arrays.asList(arr));
        int expected = 26;
        Assert.assertEquals(expected, out);
    }
}