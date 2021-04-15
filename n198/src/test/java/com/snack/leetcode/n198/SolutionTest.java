package com.snack.leetcode.n198;

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
    public void rob() {
        int[] nums = {2, 3, 2};
        int out = s.rob(nums);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void rob2() {
        int[] nums = {1, 2, 3, 1};
        int out = s.rob(nums);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void rob3() {
        int[] nums = {0};
        int out = s.rob(nums);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void rob4() {
        int[] nums = {2, 7, 9, 3, 1};
        int out = s.rob(nums);
        int expert = 12;
        Assert.assertEquals(expert, out);
    }
}