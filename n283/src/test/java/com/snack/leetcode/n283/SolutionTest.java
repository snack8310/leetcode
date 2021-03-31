package com.snack.leetcode.n283;

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
    public void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        s.moveZeroes(nums);
        int[] expert = {1, 3, 12, 0, 0};
        Assert.assertArrayEquals(expert, nums);
    }

    @Test
    public void moveZeroes2() {
        int[] nums = {};
        s.moveZeroes(nums);
        int[] expert = {};
        Assert.assertArrayEquals(expert, nums);
    }

    @Test
    public void moveZeroes3() {
        int[] nums = {0};
        s.moveZeroes(nums);
        int[] expert = {0};
        Assert.assertArrayEquals(expert, nums);
    }

    @Test
    public void moveZeroes4() {
        int[] nums = {0, 0};
        s.moveZeroes(nums);
        int[] expert = {0, 0};
        Assert.assertArrayEquals(expert, nums);
    }

    @Test
    public void moveZeroes5() {
        int[] nums = {0, 0, 1};
        s.moveZeroes(nums);
        int[] expert = {1, 0, 0};
        Assert.assertArrayEquals(expert, nums);
    }
}