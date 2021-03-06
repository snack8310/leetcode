package com.snack.leetcode.n503;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void nextGreaterElements() {
        int[] nums = {2, 3, 1};
        int[] rets = {3, -1, 2};
        Assert.assertArrayEquals(rets, s.nextGreaterElements(nums));
    }

    @Test
    public void nextGreaterElements2() {
        int[] nums = {2, 3, 1, 5, 6, 9, 4};
        int[] rets = {3, 5, 5, 6, 9, -1, 5};
        Assert.assertArrayEquals(rets, s.nextGreaterElements(nums));
    }
}