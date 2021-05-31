package com.snack.leetcode.o38;

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
    public void permutation() {
        String s = "abc";
        String[] out = solution.permutation(s);
        String[] expected = {"abc", "acb", "bac", "bca", "cba", "cab"};
        Assert.assertArrayEquals(expected, out);
    }
}