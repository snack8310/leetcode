package com.snack.leetcode.n456;

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
    public void find132pattern() {
        int[] nums = {1, 2, 3, 4};
        boolean out = s.find132pattern(nums);
        Assert.assertFalse(out);
    }

    @Test
    public void find132pattern2() {
        int[] nums = {3, 1, 4, 2};
        boolean out = s.find132pattern(nums);
        Assert.assertTrue(out);
    }

    @Test
    public void find132pattern3() {
        int[] nums = {-1, 3, 2, 0};
        boolean out = s.find132pattern(nums);
        Assert.assertTrue(out);
    }

    @Test
    public void find132pattern4() {
        int[] nums = {1, 4, 2, 3};
        boolean out = s.find132pattern(nums);
        Assert.assertTrue(out);
    }
}