package com.snack.leetcode.n525;

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
    public void findMaxLength() {
        int[] nums = {0, 1};
        int out = solution.findMaxLength(nums);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaxLength2() {
        int[] nums = {0, 1, 0};
        int out = solution.findMaxLength(nums);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaxLength3() {
        int[] nums = {0, 1, 0, 1, 0, 1, 1};
        int out = solution.findMaxLength(nums);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaxLength4() {
        int[] nums = {0, 1, 0, 1, 1, 0, 1, 1};
        int out = solution.findMaxLength(nums);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaxLength5() {
        int[] nums = {0};
        int out = solution.findMaxLength(nums);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaxLength6() {
        int[] nums = {0, 0, 0, 1, 1, 1, 0};
        int out = solution.findMaxLength(nums);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaxLength7() {
        int[] nums = {0, 0, 1, 0, 0, 0, 1, 1};
        int out = solution.findMaxLength(nums);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }
}