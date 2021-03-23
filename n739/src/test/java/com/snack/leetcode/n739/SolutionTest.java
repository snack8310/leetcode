package com.snack.leetcode.n739;

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
    public void dailyTemperatures() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] out = s.dailyTemperatures(temperatures);
        int[] expert = {1, 1, 4, 2, 1, 1, 0, 0};
        Assert.assertArrayEquals(expert, out);
    }
}