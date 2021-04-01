package com.snack.leetcode.n1;

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
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] out = s.twoSum(nums, target);
        int[] expert = {0, 1};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void twoSum2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] out = s.twoSum(nums, target);
        int[] expert = {1, 2};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void twoSum3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] out = s.twoSum(nums, target);
        int[] expert = {0, 1};
        Assert.assertArrayEquals(expert, out);
    }
}