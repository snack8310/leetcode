package com.snack.leetcode.n659;

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
    public void isPossible() {
        int[] nums = {1, 2, 3, 3, 4, 5};
        boolean out = s.isPossible(nums);
        Assert.assertTrue(out);
    }

    @Test
    public void isPossible2() {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 5};
        boolean out = s.isPossible(nums);
        Assert.assertTrue(out);
    }

    @Test
    public void isPossible3() {
        int[] nums = {1, 2, 3, 4, 4, 5};
        boolean out = s.isPossible(nums);
        Assert.assertFalse(out);
    }

    @Test
    public void isPossible4() {
        int[] nums = {1, 2, 3};
        boolean out = s.isPossible(nums);
        Assert.assertTrue(out);
    }

    @Test
    public void isPossible5() {
        int[] nums = {1, 2, 3, 5, 5, 6, 7};
        boolean out = s.isPossible(nums);
        Assert.assertFalse(out);
    }

    @Test
    public void isPossible6() {
        int[] nums = {8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        boolean out = s.isPossible(nums);
        Assert.assertTrue(out);
    }
}