package com.snack.leetcode.n645;

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
    public void findErrorNums() {
        int[] nums = {1, 2, 2, 4};
        int[] out = s.findErrorNums(nums);
        int[] expert = {2, 3};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void findErrorNums2() {
        int[] nums = {1, 1};
        int[] out = s.findErrorNums(nums);
        int[] expert = {1, 2};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void findErrorNums3() {
        int[] nums = {2, 2};
        int[] out = s.findErrorNums(nums);
        int[] expert = {2, 1};
        Assert.assertArrayEquals(expert, out);
    }

}