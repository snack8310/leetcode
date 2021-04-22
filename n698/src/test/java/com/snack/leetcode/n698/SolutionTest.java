package com.snack.leetcode.n698;

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
    public void canPartitionKSubsets() {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        boolean out = s.canPartitionKSubsets(nums, k);
        Assert.assertTrue(out);
    }

    @Test
    public void canPartitionKSubsets2() {
        int[] nums = {2,2,2,2,2,2,2,2,2,2,2,2,2,3,3};
        int k = 8;
        boolean out = s.canPartitionKSubsets(nums, k);
        Assert.assertFalse(out);
    }
}