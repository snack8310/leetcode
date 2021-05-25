package com.snack.leetcode.n1787;

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
    public void minChanges() {
        int[] nums = {1, 2, 0, 3, 0};
        int k = 1;
        int out = solution.minChanges(nums, k);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minChanges2() {
        int[] nums = {3, 4, 5, 2, 1, 7, 3, 4, 7};
        int k = 3;
        int out = solution.minChanges(nums, k);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minChanges3() {
        int[] nums = {1, 2, 4, 1, 2, 5, 1, 2, 6};
        int k = 3;
        int out = solution.minChanges(nums, k);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }
}