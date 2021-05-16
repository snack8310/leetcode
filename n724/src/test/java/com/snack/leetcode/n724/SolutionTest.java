package com.snack.leetcode.n724;

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
    public void pivotIndex() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int out = s.pivotIndex(nums);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void pivotIndex2() {
        int[] nums = {1, 2, 3};
        int out = s.pivotIndex(nums);
        int expected = -1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void pivotIndex3() {
        int[] nums = {2, 1, -1};
        int out = s.pivotIndex(nums);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void pivotIndex4() {
        int[] nums = {1, -1, 2};
        int out = s.pivotIndex(nums);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }


}