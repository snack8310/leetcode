package com.snack.leetcode.n477;

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
    public void totalHammingDistance() {
        int[] nums = {4, 14, 2};
        int out = s.totalHammingDistance(nums);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }
}