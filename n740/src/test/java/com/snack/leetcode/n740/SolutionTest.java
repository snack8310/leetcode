package com.snack.leetcode.n740;

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
    public void deleteAndEarn() {
        int[] nums = {3, 4, 2};
        int out = s.deleteAndEarn(nums);
        int expert = 6;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void deleteAndEarn2() {
        int[] nums = {2, 2, 3, 3, 3, 4};
        int out = s.deleteAndEarn(nums);
        int expert = 9;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void deleteAndEarn3() {
        int[] nums = {3};
        int out = s.deleteAndEarn(nums);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }
}