package com.snack.leetcode.n1720;

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
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] out = s.decode(encoded, first);
        int[] expert = {1, 0, 2, 1};
        Assert.assertArrayEquals(expert, out);
    }


    @Test
    public void decode2() {
        int[] encoded = {6, 2, 7, 3};
        int first = 4;
        int[] out = s.decode(encoded, first);
        int[] expert = {4, 2, 0, 7, 4};
        Assert.assertArrayEquals(expert, out);
    }
}