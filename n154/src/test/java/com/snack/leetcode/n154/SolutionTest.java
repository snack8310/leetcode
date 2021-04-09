package com.snack.leetcode.n154;

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
        int[] nums = {1, 3, 5};
        int out = s.findMin(nums);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void findMin2() {
        int[] nums = {2, 2, 2, 0, 1};
        int out = s.findMin(nums);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}