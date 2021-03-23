package com.snack.leetcode.n239;

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
    public void maxSlidingWindow() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] out = s.maxSlidingWindow(nums, 3);
        int[] expert = {3, 3, 5, 5, 6, 7};
        Assert.assertArrayEquals(expert, out);
    }
}