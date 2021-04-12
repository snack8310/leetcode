package com.snack.leetcode.n179;

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
    public void largestNumber() {
        int[] nums = {10, 2};
        String out = s.largestNumber(nums);
        String expert = "210";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void largestNumber2() {
        int[] nums = {3, 30, 34, 5, 9};
        String out = s.largestNumber(nums);
        String expert = "9534330";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void largestNumber3() {
        int[] nums = {1};
        String out = s.largestNumber(nums);
        String expert = "1";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void largestNumber4() {
        int[] nums = {10};
        String out = s.largestNumber(nums);
        String expert = "10";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void largestNumber5() {
        int[] nums = {0, 0};
        String out = s.largestNumber(nums);
        String expert = "0";
        Assert.assertEquals(expert, out);
    }
}