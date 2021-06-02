package com.snack.leetcode.n523;

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
    public void checkSubarraySum() {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        boolean out = solution.checkSubarraySum(nums, k);
        Assert.assertTrue(out);
    }

    @Test
    public void checkSubarraySum2() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        boolean out = solution.checkSubarraySum(nums, k);
        Assert.assertTrue(out);
    }

    @Test
    public void checkSubarraySum3() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 13;
        boolean out = solution.checkSubarraySum(nums, k);
        Assert.assertFalse(out);
    }

    @Test
    public void checkSubarraySum4() {
        int[] nums = {23, 2, 4, 6, 6};
        int k = 7;
        boolean out = solution.checkSubarraySum(nums, k);
        Assert.assertTrue(out);
    }

    @Test
    public void checkSubarraySum5() {
        int[] nums = {0};
        int k = 1;
        boolean out = solution.checkSubarraySum(nums, k);
        Assert.assertFalse(out);
    }

    @Test
    public void checkSubarraySum6() {
        int[] nums = {1, 0};
        int k = 2;
        boolean out = solution.checkSubarraySum(nums, k);
        Assert.assertFalse(out);
    }

    @Test
    public void checkSubarraySum7() {
        int[] nums = {5, 0, 0, 0};
        int k = 3;
        boolean out = solution.checkSubarraySum(nums, k);
        Assert.assertTrue(out);
    }
}