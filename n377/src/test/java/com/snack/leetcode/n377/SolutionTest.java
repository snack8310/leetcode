package com.snack.leetcode.n377;

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
    public void combinationSum4() {
        int[] nums = {1, 2, 3};
        int target = 4;
        int out = s.combinationSum4(nums, target);
        int expert = 7;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void combinationSum42() {
        int[] nums = {9};
        int target = 3;
        int out = s.combinationSum4(nums, target);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}