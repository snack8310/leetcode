package com.snack.leetcode.n81;

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
    public void search() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean out = s.search(nums, target);
        Assert.assertTrue(out);
    }

    @Test
    public void search2() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        boolean out = s.search(nums, target);
        Assert.assertFalse(out);
    }

    @Test
    public void search3() {
        int[] nums = {};
        int target = 3;
        boolean out = s.search(nums, target);
        Assert.assertFalse(out);
    }

    @Test
    public void search4() {
        int[] nums = {2, 5, 6, 6, 0, 0, 1, 2};
        int target = -1;
        boolean out = s.search(nums, target);
        Assert.assertFalse(out);
    }

    @Test
    public void search5() {
        int[] nums = {1, 0, 1, 1, 1};
        int target = 0;
        boolean out = s.search(nums, target);
        Assert.assertTrue(out);
    }

    @Test
    public void search6() {
        int[] nums = {1};
        int target = 0;
        boolean out = s.search(nums, target);
        Assert.assertTrue(out);
    }
}