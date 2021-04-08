package com.snack.leetcode.n153;

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
    public void findMin() {
        int[] nums = {3, 4, 5, 1, 2};
        int out = s.findMin(nums);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMin2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int out = s.findMin(nums);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMin3() {
        int[] nums = {11, 13, 15, 17};
        int out = s.findMin(nums);
        int expert = 11;
        Assert.assertEquals(expert, out);
    }
}