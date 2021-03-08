package com.snack.leetcode.n300;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void lengthOfLIS() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        Assert.assertEquals(4, s.lengthOfLIS(nums));

    }

    @Test
    public void lengthOfLIS1() {
        int[] nums = {0, 1, 0, 3, 2, 3};
        Assert.assertEquals(4, s.lengthOfLIS(nums));

    }

    @Test
    public void lengthOfLIS2() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        Assert.assertEquals(1, s.lengthOfLIS(nums));

    }

    @Test
    public void lengthOfLIS3() {
        int[] nums = {10, 9, 4, 5, 3, 4, 101, 18};
        Assert.assertEquals(3, s.lengthOfLIS(nums));

    }
}