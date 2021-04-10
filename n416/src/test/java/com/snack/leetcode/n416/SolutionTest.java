package com.snack.leetcode.n416;

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
    public void canPartition() {
        int[] nums = {1, 5, 11, 5};
        boolean out = s.canPartition(nums);
        Assert.assertTrue(out);
    }

    @Test
    public void canPartition2() {
        int[] nums = {1, 2, 3, 5};
        boolean out = s.canPartition(nums);
        Assert.assertFalse(out);
    }
}