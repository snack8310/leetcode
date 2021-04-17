package com.snack.leetcode.n55;

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
    public void canJump() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean out = s.canJump(nums);
        Assert.assertTrue(out);
    }

    @Test
    public void canJump2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean out = s.canJump(nums);
        Assert.assertFalse(out);
    }

    @Test
    public void canJump3() {
        int[] nums = {};
        boolean out = s.canJump(nums);
        Assert.assertFalse(out);
    }

    @Test
    public void canJump4() {
        int[] nums = {0};
        boolean out = s.canJump(nums);
        Assert.assertTrue(out);
    }

}