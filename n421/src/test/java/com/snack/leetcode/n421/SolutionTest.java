package com.snack.leetcode.n421;

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
    public void findMaximumXOR() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int out = s.findMaximumXOR(nums);
        int expected = 28;
        Assert.assertEquals(expected, out);
    }


    @Test
    public void findMaximumXOR2() {
        int[] nums = {0};
        int out = s.findMaximumXOR(nums);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaximumXOR3() {
        int[] nums = {2, 4};
        int out = s.findMaximumXOR(nums);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaximumXOR4() {
        int[] nums = {8, 10, 2};
        int out = s.findMaximumXOR(nums);
        int expected = 10;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findMaximumXOR5() {
        int[] nums = {14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        int out = s.findMaximumXOR(nums);
        int expected = 127;
        Assert.assertEquals(expected, out);
    }
}