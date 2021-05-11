package com.snack.leetcode.n1734;

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
    public void decode() {
        int[] encoded = {3, 1};
        int[] out = s.decode(encoded);
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void decode2() {
        int[] encoded = {6, 5, 4, 6};
        int[] out = s.decode(encoded);
        int[] expected = {2, 4, 1, 5, 3};
        Assert.assertArrayEquals(expected, out);
    }
}