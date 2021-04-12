package com.snack.leetcode.o45;

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
    public void minNumber() {
        int[] nums = {10, 2};
        String out = s.minNumber(nums);
        String expert = "102";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minNumber2() {
        int[] nums = {3, 30, 34, 5, 9};
        String out = s.minNumber(nums);
        String expert = "3033459";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minNumber3() {
        int[] nums = {0, 0};
        String out = s.minNumber(nums);
        String expert = "00";
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minNumber4() {
        int[] nums = {0, 1, 2, 3, 4};
        String out = s.minNumber(nums);
        String expert = "01234";
        Assert.assertEquals(expert, out);
    }
}